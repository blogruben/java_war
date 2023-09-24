:: Ejecutar como administrador
::  @echo off para no mostrar los comandos que se ejecutan.
@echo on
cd "%~dp0"
if exist "jdk8" rd /s /q  "%jdk8"
if exist "java-se-8u43-ri" rd /s /q  "%java-se-8u43-ri"
if exist "jdk8.zip" del  /f /q "%jdk8.zip"
:: descargar JDK 
curl -o "jdk8.zip" https://download.java.net/openjdk/jdk8u43/ri/openjdk-8u43-windows-i586.zip
:: descomprimir
tar -xf "jdk8.zip" 
:: eliminar zip
del /f /q "jdk8.zip" 
:: renombrar directorio 
ren "java-se-8u43-ri" "jdk8" 
:: %~dp0 directorio del este batch, y configuramos el directorio de manera absoluta
setx /m JAVA_HOME "%~dp0jdk8"
:: salir programa
pause
exit /b 0
