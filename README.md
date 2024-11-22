This project involves database design of golf members and tournaments with 
controller REST API endpoints, mapping object models and using repositories to interact 
with MySQL database.
It also involves creating a docker configuration(dockerfile and docker-compose.yml) 
ensuring that MySQL runs in docker as well as testing endpoints using postman to verify that adding,
retrieving members, tournaments, and adding members to tournament as well as search functionality are 
effectively working as expected.

To run the project:
- Build the spring boot JAR file; by running maven clean, package
- Build the docker image using dockerfile
- Start the spring boot and MySQL containers; run docker-compose up
- Verify that the API is running at localhost:8088 as specified
- MySQL running in the docker accessible at localhost:3307 as specified

Testing with postman:
- Add a member
POST:http://localhost:8088/api/members
- Add a tournament
POST:http://localhost:8088/api/tournaments
- Add member to a tournament
POST:http://localhost:8088/api/tournaments/{tournament_id}/members/{member_id}
- Search for members by name
GET:http://localhost:8088/api/members/search?name=John
- Search for tournaments by location
GET:http://localhost:8088/api/tournaments/search?location=Greenfield Golf Club
- Get all members:
GET:http://localhost:8088/api/members
- Get all tournaments:
GET:http://localhost:8088/api/tournaments


Stopping the containers:
docker-compose down


