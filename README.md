
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
aws cloudformation create-stack --stack-name teststack --template-body file:////....//spring-boot-in-action//deploy//aws//stack.json
```

注意在~/.ssh/的目录下有MyAWSInstanceKey.pem文件:

```
cd deploy
ansible-playbook playbook.yml
```