FROM alpine:latest
RUN mkdir -p /usr/prod/
COPY ./out/production/actividad4 /usr/prod/
WORKDIR /usr/prod/
RUN apk --update add openjdk8-jre
CMD ["java", "edu.unicesar.taller.cuarto.main.Main"]
