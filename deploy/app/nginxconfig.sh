# shellcheck disable=SC2034
CONF="server {
        listen $PORT;

        location / {
          root   /usr/share/nginx/html;
          index  index.html index.htm;
          try_files \$uri \$uri/ /index.html;
        }

        error_page   500 502 503 504  /50x.html;

        location = /50x.html {
          root   /usr/share/nginx/html;
        }
      }"
echo "$CONF" >/etc/nginx/conf.d/default.conf
nginx -g 'daemon off;'