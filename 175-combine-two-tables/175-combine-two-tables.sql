SELECT P.FirstName,P.LastName,A.City,A.State from Person P Left join Address A on P.personId=A.personId;