FROM ubuntu:latest
RUN apt-get -y update && apt-get -y upgrade
RUN apt-get -y install openjdk-8-jdk wget
# instalar tomcat
RUN mkdir /usr/local/tomcat
RUN wget https://dlcdn.apache.org/tomcat/tomcat-9/v9.0.80/bin/apache-tomcat-9.0.80.tar.gz -O /tmp/tomcat.tar.gz
RUN cd /tmp && tar xvfz tomcat.tar.gz
RUN cp -Rv /tmp/apache-tomcat-9.0.80/* /usr/local/tomcat/
# ssl
RUN cd /usr/local/tomcat; mkdir ssh
RUN cd /usr/local/tomcat/ssh; keytool -genkey -keyalg RSA -keystore selfsigned.jks -validity 365 -keysize 2048 -storepass 'changeit' -dname "CN=Raul, OU=Java, O=Oracle, L=Madrdi,S=Madrid, C=ES" -alias tomcat
# server.xml
COPY docker/server.xml /usr/local/tomcat/conf/server.xml
# falta el app.war
EXPOSE 8443
CMD /usr/local/tomcat/bin/catalina.sh run


