# Blog Platform RESTful API

This project is a simple RESTful API for a blog platform. It allows users to perform CRUD operations on blog posts using HTTP requests.

## Technologies Used

- Java
- Spring Boot
- Maven

## Getting Started

To run this project locally, follow these steps:

1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Build the project using Maven.
4. Run the application.

## API Endpoints

The following API endpoints are available:

### Get All Blog Posts

- Endpoint: GET /posts
- Description: Retrieves a list of all blog posts.
- Response: JSON array of blog posts.

### Create a Blog Post

- Endpoint: POST /posts
- Description: Creates a new blog post.
- Request Body: JSON object containing the title, content, and author of the post.
- Response: JSON object of the created blog post.

### Update a Blog Post

- Endpoint: PUT /posts/{id}
- Description: Updates an existing blog post with the specified ID.
- Request Body: JSON object containing the updated title, content, and/or author of the post.
- Response: JSON object of the updated blog post.

### Get a Blog Post

- Endpoint: GET /posts/{id}
- Description: Retrieves a specific blog post by its ID.
- Response: JSON object of the blog post.

### Delete a Blog Post

- Endpoint: DELETE /posts/{id}
- Description: Deletes a specific blog post by its ID.

## Testing the API

You can test the API using tools like cURL or Postman. Here are some example requests:

- Retrieve all blog posts: `GET http://localhost:8080/posts`
- Create a new blog post: `POST http://localhost:8080/posts`
    - Request Body: JSON object with the title, content, and author.
- Update a blog post: `PUT http://localhost:8080/posts/{id}`
    - Request Body: JSON object with the updated title, content, and/or author.
- Retrieve a blog post: `GET http://localhost:8080/posts/{id}`
- Delete a blog post: `DELETE http://localhost:8080/posts/{id}`

Make sure to replace `{id}` with the actual ID of the blog post.

These are some example commands used to test this particular project (remember to place 3 hashtags above each command to separate):
GET http://localhost:8080/posts

POST http://localhost:8080/posts
Content-Type: application/json

{
"title": "My New Post",
"content": "Lorem ipsum dolor sit amet...",
"author": "John Doe"
}

PUT http://localhost:8080/posts/1
Content-Type: application/json

{
"title": "Updated Post",
"content": "New content...",
"author": "Jane Smith"
}


GET http://localhost:8080/posts
<> 2023-06-30T132207.200.json

POST http://localhost:8080/posts
Content-Type: application/json

{
"title": "My New Post",
"content": "Lorem ipsum dolor sit amet...",
"author": "John Doe"
}


GET http://localhost:8080/posts
DELETE http://localhost:8080/posts/1
GET http://localhost:8080/posts

