## API Endpoints
Use POSTMAN to try the following endpoints:

## Get list of Animals

### Request

    `GET /animals/all`

    `http://localhost:8080/animals/all`

   
### Response

     [
     { "animalId": 8888, "name":"Humans", "scienceName": "Homosapiens", "species": "Mammals", "habitat": "Home", "description": "Test"}
     ]

## Get a specific Animal

### Request

`GET /animals/{animalId}`

`http://localhost:8080/animal/1`

### Response

  
    { "animalId": 1, "name":"Humans", "scienceName": "Homosapiens", "species": "Mammals", "habitat": "Home", "description": "Test"}
     

     
## Create a new Animal

### Request

    `POST /animals/new`
    
    `http://localhost:8080/animals/new` --data '{"name": "sample4", "science_name": "scienceName", "species": "species", "habitat": "habitat", "description": "description"}'

   ### Response

   [
   
     { "animalId": 1, "name":"Test1", "scienceName": "Test1", "species": "Test1", "habitat": "Home", "description": "Test"},
      { "animalId": 2, "name":"Test2", "scienceName": "Test2", "species": "Test2", "habitat": "Home", "description": "Test"},
   
  ]

## Get Animals by Species

### Request

    `GET /animals/species?species=Mammals`

    `http://localhost:8080/animals/species?species=Mammals'

   
### Response

     [
   
      { "animalId": 1, "name":"Humans", "scienceName": "Homosapiens", "species": "Mammals", "habitat": "Home", "description": "Test"}
   
      { "animalId": 4, "name": "Elephant", "scienceName": "NULL", "species": "Mammals", "habitat": "Savannah", "description": "The largest land animal" }
   
     ]

## Get Animal By Habitat

### Request

    `GET /animals/habitat?habitat=home`

    `http://localhost:8080/animals/habitat?habitat="home"`

   
### Response

   [
   
     [
  {
    "animalId": 1,
    "name": "Human",
    "scienceName": "Homo sapiens",
    "species": "Mammals",
    "habitat": "Home",
    "description": "Test description"
  },
  {
    "animalId": 2,
    "name": "Cat",
    "scienceName": "NULL",
    "species": "Mammals",
    "habitat": "Home",
    "description": "Test"
  },
  {
    "animalId": 4,
    "name": "Dog",
    "scienceName": "NULL",
    "species": "Mammals",
    "habitat": "Home",
    "description": "Test"
  }
]

## Get Animal by Name

### Request

     `GET /animals/name?name=human`

    `http://localhost:8080/animals/name?name=human`

### Response

[
{ "animalId": 1, "name":"Humans", "scienceName": "Homosapiens", "species": "Mammals", "habitat": "Home", "description": "Test"}
]



## Update an existing Animal

### Request

    `PUT /animals/update/{animalId}`
    
    `http://localhost:8080/animals/update/1` --data '{"name": "sample4", "scienceName": "scienceName", "species": "species", "habitat": "habitat", "description": "description"}'

   ### Response
   
    {
  "name": "Elephant",
  "scienceName": "NULL",
  "species": "Mammals",
  "habitat": "Savannah",
  "description": "Test"
}



## Delete an existing Animal

### Request

    `DELETE /animals/delete/{animalId}`
    
    `http://localhost:8080/animals/delete/1`

   ### Response
   
   [
   
     [
  {
    "animalId": 2,
    "name": "Lion",
    "scienceName": "NULL",
    "species": "Mammals",
    "habitat": "Savannah",
    "description": "Test"
  },
  {
    "animalId": 3,
    "name": "Elephant",
    "scienceName": "NULL",
    "species": "Mammals",
    "habitat": "Savannah",
    "description": "Test"
  },
  {
    "animalId": 4,
    "name": "Penguin",
    "scienceName": "NULL",
    "species": "Birds",
    "habitat": "Antarctica",
    "description": "Test"
  }
]

   
  ]
