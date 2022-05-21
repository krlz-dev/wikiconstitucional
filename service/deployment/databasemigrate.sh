sudo chmod 600 .pgpass
export PGPASSFILE='.pgpass'
pg_dump --clean --no-owner -h localhost -p 6432  -U postgres -v db_econstitucional > db_econstitucional_backup.dump
heroku pg:psql -a econstitucional-service < db_econstitucional_backup.dump