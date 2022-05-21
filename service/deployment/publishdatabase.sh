heroku container:login
docker push registry.heroku.com/econstitucional-database/web
heroku container:release  -a econstitucional-database
heroku logs -a econstitucional-service -t
