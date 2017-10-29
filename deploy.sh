
cd $1/github/spring4_tiles2

gradle build

service tomcat8 stop

rm -rf /var/lib/tomcat8/webapps/demo
rm -rf /var/lib/tomcat8/webapps/demo.war

cp $1/github/spring4_tiles2/build/libs/spring4_tiles2-1.0.war /var/lib/tomcat8/webapps/demo.war

service tomcat8 start

exit
