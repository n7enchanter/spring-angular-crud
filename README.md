# Spring-Nngular-Crud

## Set up
* Clone the repository.
* Import the project to IDE.
* Update ../resources/application.properties  with MYSQL connection data
* In terminal navigate to /ang-crud folder and run "npm run start" command

## Manual
* Go to “http://localhost:4200” in browser. You will see a data table:

![screenshot from 2019-01-29 14-32-40](https://user-images.githubusercontent.com/17470991/51915585-27dfba00-23e4-11e9-810d-a7783f0872a5.png)

* This table has a pagination and filtering functionality. To filter the table write your search statement inside 'empName' input filed and press 'Submit' button. It will filter your table with 'Starts with' predicate 
![screenshot from 2019-01-29 14-34-30](https://user-images.githubusercontent.com/17470991/51915734-7a20db00-23e4-11e9-929e-162765dfb9a0.png)

* You can check and edit your “ Employee ” data as well by pressing 'View' and 'Edit' buttons respectively

### View

![screenshot from 2019-01-29 16-45-12](https://user-images.githubusercontent.com/17470991/51916561-3dee7a00-23e6-11e9-8336-52560ced7628.png)

### Edit

![screenshot from 2019-01-29 16-45-35](https://user-images.githubusercontent.com/17470991/51916603-578fc180-23e6-11e9-929c-218145e05fee.png)
* On edit popup you can change Employee details and submit them to db

![screenshot from 2019-01-29 16-46-21](https://user-images.githubusercontent.com/17470991/51916837-d5ec6380-23e6-11e9-99a5-bb01a2852e77.png)

![screenshot from 2019-01-29 16-46-53](https://user-images.githubusercontent.com/17470991/51916866-e6044300-23e6-11e9-997f-77f1e61b093b.png)
* You can add new Employee by pressing 'Add' button. Fill the inputs with data in the popup window  and press 'Submit' button
![screenshot from 2019-01-29 16-50-16](https://user-images.githubusercontent.com/17470991/51917111-7c386900-23e7-11e9-801e-7f3fd7ea6851.png)
![screenshot from 2019-01-29 16-50-48](https://user-images.githubusercontent.com/17470991/51917132-89edee80-23e7-11e9-9e64-94bbcce0ba3a.png)

* You can delete your 'Employee' by pressing “delete” button

# [UPDATE]

* Paginator now has the ability to manualy change the page
![image](https://user-images.githubusercontent.com/17470991/52118906-416d4580-2620-11e9-9bf7-bc0496299fe8.png)
