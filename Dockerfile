#imagen modelo
FROM eclipse-temurin:21.0.6_7-jdk-alpine

#informar puerto de ejecucion del contenedor
EXPOSE 8080

#definir directorio
WORKDIR /root

#copiar y pegar archivo en el contenedor
COPY ./pom.xml /root

COPY ./.mvn /root/.mvn

COPY ./mvnw /root

#descargar las dependencias
RUN ./mvnw dependency:go-offline

#copiar codigo fuente
COPY ./src /root/src

#construir la aplicacion
RUN ./mvnw clean install -DskipTests

#levantar la aplicacion
ENTRYPOINT ["java","-jar","/root/target/demo-0.0.1.jar"]

#comando
#docker build -t "nombre imagen" . el punto es la ruta