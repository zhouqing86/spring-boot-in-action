
## Create war package

```
./gradlew build
```

Run `java -jar build/libs/inaction-0.0.1-SNAPSHOT.war`.

## Run package with production profile

```
java -jar build/libs/inaction-0.0.1-SNAPSHOT.war --spring.profiles.active=production
```


## Deployment

通过aws cli来检查cloudformation模板是不是正确:

```
aws cloudformation validate-template --template-body file:////....//spring-boot-in-action//deploy//aws//stack.json
```

### awscli创建stack
确认AWS的用户有cloudformation的权限，如果没有需要添加，如下是一个全部放开的权限：

```
{
    "Version": "2012-10-17",
    "Statement": [
        {
            "Sid": "Stmt1492762901000",
            "Effect": "Allow",
            "Action": [
                "cloudformation:*"
            ],
            "Resource": [
                "*"
            ]
        }
    ]
}
```

创建stack:

```
aws cloudformation create-stack --stack-name teststack --template-body file:////Users//qzhou//project//training//java//spring-boot-in-action//deploy//aws//stack.json --capabilities CAPABILITY_IAM
```

更新stack:

```
aws cloudformation update-stack --stack-name teststack --template-body file:////Users//qzhou//project//training//java//spring-boot-in-action//deploy//aws//stack.json --capabilities CAPABILITY_IAM

```

删除stack:

```
aws cloudformation delete-stack --stack-name teststack
```

查看stack信息:

```
aws cloudformation describe-stacks
```

注意在stack.json中我们创建了IAM用户，所以要加上`--capabilities CAPABILITY_IAM`。

### 本地远程执行ansible脚本
注意在~/.ssh/的目录下有MyAWSInstanceKey.pem文件, 并修改hosts文件为EC2的IP地址, 修改playbook.yml中hosts配置为web.

```
cd deploy
ansible-playbook -i hosts playbook.yml
```

### build与执行

build jar包，内嵌tomcat容器:

```
./gradlew build
```

如何在产品环境运行:

```
java -jar xxx.jar --spring.profiles.active=production
```