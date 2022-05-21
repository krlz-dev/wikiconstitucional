cd ..
sbt docker:publishLocal
docker tag registry.heroku.com/econstitucional-service/web/wikiconstitucional:latest registry.heroku.com/econstitucional-service/web
heroku container:login
docker push registry.heroku.com/econstitucional-service/web
heroku container:release web -a econstitucional-service
heroku logs -a econstitucional-service -t
