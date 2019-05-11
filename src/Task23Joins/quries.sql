SELECT authors.Name,authors.Surname,books.Title as book_name from authors INNER join autors_book on authors.ID_authors=autors_book.ID_authors
INNER JOIN books on autors_book.ID_Books=books.ID_Books


/*SELECT DISTINCT authors.Name,authors.Surname from authors INNER join autors_book on authors.ID_authors=autors_book.ID_authors
  INNER JOIN books on autors_book.ID_Books=books.ID_Books
WHERE authors.Nationality = 'Russia'*/

/*SELECT DISTINCT authors.Name,authors.Surname from authors INNER join autors_book on authors.ID_authors=autors_book.ID_authors
  INNER JOIN books on autors_book.ID_Books=books.ID_Books
WHERE authors.Date_birth < 1900*/

/*DELETE FROM books
WHERE Title = 'The Old Man Sea'*/

/*SELECT DISTINCT authors.Name,authors.Surname,authors.Nationality,avg(books.Number_pages) from authors INNER join autors_book on authors.ID_authors=autors_book.ID_authors
  INNER JOIN books on autors_book.ID_Books=books.ID_Books
GROUP BY authors.Date_birth*/

/*SELECT DISTINCT authors.Name,authors.Surname,avg(books.Number_pages) as AVG_pages from authors INNER join autors_book on authors.ID_authors=autors_book.ID_authors
  INNER JOIN books on autors_book.ID_Books=books.ID_Books
GROUP BY authors.Surname
HAVING AVG_pages < 300*/

/*SELECT DISTINCT authors.Name,authors.Surname,avg(books.Number_pages) as AVG_pages from authors INNER join autors_book on authors.ID_authors=autors_book.ID_authors
  INNER JOIN books on autors_book.ID_Books=books.ID_Books
GROUP BY authors.Surname
HAVING AVG_pages > (SELECT avg(books.Number_pages) FROM books)*/

CREATE TABLE `batch`.`try_third` (
  `ID` INT NOT NULL,
  `LA` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`))
  ENGINE = InnoDB
  DEFAULT CHARACTER SET = utf8
  COLLATE = utf8_unicode_ci;