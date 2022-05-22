FROM nginx:stable-alpine
ADD app/build /usr/share/nginx/html
ADD deploy/app/nginxconfig.sh /scripts/nginxconfig.sh
RUN chmod 777 -R /scripts
CMD /scripts/nginxconfig.sh