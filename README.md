# Big

Steps to free port which is already used to run tomcat server in Eclipse

For example , suppose 8080 port is used , we need to make free 8080 to run tomcat

Step 1: (open the CMD command)

C:\Users\username>netstat -o -n -a | findstr 0.0:8080

TCP 0.0.0.0:3000 0.0.0.0:0 LISTENING 3116

Now , we can see that LISTENING port is 3116 for 8080 ,

We need to kill 3116 now

Step 2:-

C:\Users\username>taskkill /F /PID 3116

Step 3: Go to Eclipse and start Server , it will run
