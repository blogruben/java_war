FROM tomcat:8.0-alpine
ADD sample.war /usr/local/tomcat/webapps/
COPY ./server.xml /usr/local/tomcat/conf/server.xml
EXPOSE 8080
CMD ["catalina.sh", "run"]