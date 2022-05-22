cd ../../app
npm run build
cd ..

docker build -f deploy/app/Dockerfile -t registry.heroku.com/econstitucional-app/web:latest .
heroku container:login
docker push registry.heroku.com/econstitucional-app/web:latest
heroku container:release web -a econstitucional-app
heroku logs -a econstitucional-app -t