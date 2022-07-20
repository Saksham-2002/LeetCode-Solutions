# Write your MySQL query statement below

select Person.firstName, Person.LastName, Address.city, Address.state from Person left join Address on Person.personId=Address.personId;