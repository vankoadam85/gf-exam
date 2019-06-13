# Green Fox Takeout :ramen:

We are going to create our very own online restaurant where guests can customize
their orders based on their preferences. :stew:

**Please read the whole description in order to understand the application.**

## `GET /`
- The main page should be rendered
- It should contain a form that has:
  - Two input fields with labels
  - One radio button-type selector
  - One drop-down menu

  ![](assets/form.png)

- The base options should be `rice noodles` `egg noodles` and `white rice`
- The topping options should be `chicken` `beef` and `smoked tofu`
- The customer can choose only one of each
- The form should be submitted to `POST /api/orders`
- After submission based on the response display the order id below the form and
  clear the input fields

## `POST /api/orders`
- After saving the order in the database respond with the stored order in the
  following JSON format
  ```json
    {
      "id": 2,
      "name": "István Kárász",
      "base": "white rice",
      "topping": "smoked tofu",
      "status": "ordered"
    }
  ```

## `GET /api/orders/{orderId}`
- It should respond with the stored entry in the following JSON format
   ```json
    {
      "id": 2,
      "name": "István Kárász",
      "address": "Andrassy street 66",
      "base": "white rice",
      "topping": "smoked tofu",
      "status": "ordered"
    }
  ```
- In case the order ID does not exist, the application should respond with 404
  status code

## `GET /api/orders?type=vegetarian&status=inprogress`
- This endpoint should respond in JSON format with those orders only that have
  smoked tofu as topping and that are still in progress
  ```json
  [
    {
      "id": 2,
      "name": "István Kárász",
      "base": "white rice",
      "topping": "smoked tofu",
      "status": "inprogress"
    },
    {
      "id": 5,
      "name": "Tamás Kökény",
      "base": "egg noodles",
      "topping": "smoked tofu",
      "status": "inprogress"
    }
  ]
  ```
- Type and status in the URL are required, they should return with `400` status
  code in case they are used on their own or if they are not valid
- Values that must work for the status are
  - ordered
  - inprogress
  - done
- Values that must work for the type are
  - all
  - vegetarian
- For example, `/api/orders?type=vegetarian` should return with `400` status
  code

## `PATCH /api/orders/{orderId}`
- The order status should be in the request's body in JSON format, this is how
  we will be able to modify its progress
  ```json
  {
    "status": "inprogress"
  }
  ```
- If there is no order with the specified id or the status is not valid it
  should respond with `400` status code
- Valid status values are
  - ordered
  - inprogress
  - done

## Question
Given the following table named `applicants`.

| id | name               | country_id | age |
|:---|:-------------------|:-----------|:----|
| 0  | Bořivoj Souček     | 0          | 24  |
| 1  | Papp Patrícia      | 1          | 33  |
| 2  | Kocsis Ivett       | 1          | 37  |
| 3  | Slavomír Vykukal   | 0          | 20  |
| 4  | Bruno Malík        | 0          | 31  |
| 5  | Veronika Lukešová  | 0          | 18  |
| 6  | Székely Miklós     | 1          | 29  |
| 7  | Hegedüs Benjámin   | 1          | 37  |
| 8  | Nela Machová       | 0          | 20  |
| 9  | Balog Rajmund      | 1          | 39  |
| 10 | Major Borbála      | 1          | 35  |
| 11 | Evelína Horváthová | 0          | 23  |
| 12 | Vászoly Vivien     | 1          | 40  |
| 13 | Lada Stýskalová    | 0          | 27  |
| 14 | Dagmar Benešová    | 0          | 33  |

Given the following table named `countries`.

| id | country        |
|:---|:---------------|
| 0  | Czech Republic |
| 1  | Hungary        |

Write an SQL query to select the name and the country of applicants from
Hungary with the age 40.

The expected result should be the following.

| name           | country |
|:---------------|:--------|
| Vászoly Vivien | Hungary |

### Answer
<!-- Write your answer here. (Remove this line) -->

### Good luck, we believe in you! :muscle: :green_heart:
