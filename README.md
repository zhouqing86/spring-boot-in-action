
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

注意在~/.ssh/的目录下有MyAWSInstanceKey.pem文件:

```
cd deploy
ansible-playbook playbook.yml

```