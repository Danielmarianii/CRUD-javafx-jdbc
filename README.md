Programa desenvolvido com o Java na versao 11 LTS durante as aula do professor Nelio Alves.

Para rodar esse programa é necessário o [Eclipse v4.11 ou superior]  e instalar o plug-in "e(fx)clipse" v3.4.1 ou superior  

```
Help -> Install new Software -> Work with:
 e buscar pelo Link " http://download.eclipse.org/efxclipse/updates-released/3.4.1/site/ "
 ```



As bibliotecas [MySQLconnector v5.1 ou superior] Select Operating System -> Plataform independent -> download , e [JavaFX-Gluon v11.0.2]

Criar uma User Library no Eclipse com o nome da biblioteca
```
Window -> Preferences -> Java -> Build Path -> User Libraries -> New
Dê o nome da biblioteca
Add External Jars (aponte para a pasta bin da biblioteca).

Adicione as bibliotecas ao projeto.
```
Copiar o comando abaixo e colar no caminho abaixo, "adaptando o caminho da pasta"

```
 --module-path "C:\java-libs\javafx-sdk\lib" --add-modules=javafx.fxml,javafx.controls
 ```

```
Run As -> Run Configurations -> Arguments -> VM Arguments
```

Instale o [MySQL v8.0.12 ou superior] e defina o usuario: 'root' e senha: 'root' ou altere o arquivo "db.properties".

Execute a query:

```
CREATE DATABASE coursejdbc;
```
e depois a seguinte query
```
CREATE TABLE department (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) DEFAULT NULL,
  PRIMARY KEY (Id)
);

CREATE TABLE seller (
  Id int(11) NOT NULL AUTO_INCREMENT,
  Name varchar(60) NOT NULL,
  Email varchar(100) NOT NULL,
  BirthDate datetime NOT NULL,
  BaseSalary double NOT NULL,
  DepartmentId int(11) NOT NULL,
  PRIMARY KEY (Id),
  FOREIGN KEY (DepartmentId) REFERENCES department (id)
);

INSERT INTO department (Name) VALUES 
  ('Example'),
  ('Computers'),
  ('Electronics'),
  ('Fashion'),
  ('Books');
  

INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES 
  ('Example','Example@gmail.com','1998-04-21 00:00:00',1000,1),
  ('Bob Brown','bob@gmail.com','1998-04-21 00:00:00',1000,1),
  ('Maria Green','maria@gmail.com','1979-12-31 00:00:00',3500,2),
  ('Alex Grey','alex@gmail.com','1988-01-15 00:00:00',2200,1),
  ('Martha Red','martha@gmail.com','1993-11-30 00:00:00',3000,4),
  ('Donald Blue','donald@gmail.com','2000-01-09 00:00:00',4000,3),
  ('Alex Pink','bob@gmail.com','1997-03-04 00:00:00',3000,2);
  
```



[Eclipse v4.11 ou superior]: https://www.eclipse.org/downloads/ 
[JavaFX-Gluon v11.0.2]: https://download2.gluonhq.com/openjfx/11.0.2/openjfx-11.0.2_windows-x64_bin-sdk.zip
[MySQLconnector v5.1 ou superior]: https://dev.mysql.com/downloads/connector/j/
[MySQL v8.0.12 ou superior]: https://dev.mysql.com/downloads/mysql/
