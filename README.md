
# 📚 Libreria Domestica

Un'applicazione **Spring Boot** con **Maven** e **Thymeleaf** per gestire una libreria domestica. Permette di aggiungere, modificare, eliminare e visualizzare i libri presenti nella tua collezione personale.

## 🛠️ Tecnologie Utilizzate

- **Java 17+**
- **Spring Boot** (Web, JPA, Thymeleaf)
- **Maven** (gestione delle dipendenze)
- **H2 Database** (o MySQL configurabile)
- **Thymeleaf** (template engine per la vista)

## 📦 Setup del Progetto

### Prerequisiti

Assicurati di avere installati:

- **Java 17+**
- **Maven**

### Clonare il Repository

```bash
git clone <URL_DEL_REPO>
cd nome-del-progetto
```

### Configurazione

Puoi configurare il database in `src/main/resources/application.properties`.

Esempio di configurazione PostgreSQL (predefinito):

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/libreria
spring.datasource.username=tuo-username
spring.datasource.password=tuo-password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Esecuzione del Progetto

Per eseguire l'applicazione:

```bash
mvn spring-boot:run
```

L'applicazione sarà disponibile su: [http://localhost:9191](http://localhost:9191)

## 📚 Funzionalità

- 📖 **Gestione Libri**: Aggiungi, visualizza, modifica ed elimina libri.
- 🔍 **Ricerca**: Cerca libri per titolo, autore o genere.
- 🏷️ **Categorie**: Organizza i libri in categorie.

## 📂 Struttura del Progetto

```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.libreria
│   │   │       ├── LibreriaApplication.java
│   │   │       ├── controller
│   │   │       ├── model
│   │   │       ├── repository
│   │   │       └── service
│   │   └── resources
│   │       ├── templates
│   │       └── application.properties
└── pom.xml
```

## 📊 Esempio di Endpoints

| Metodo | Endpoint          | Descrizione              |
|--------|-------------------|--------------------------|
| GET    | `/`               | Home Page               |
| GET    | `/libri`          | Lista di tutti i libri  |
| GET    | `/libri/{id}`     | Dettaglio di un libro   |
| GET    | `/libri/nuovo`    | Form per nuovo libro    |
| POST   | `/libri`          | Salva un nuovo libro    |
| GET    | `/libri/modifica/{id}` | Modifica un libro      |
| POST   | `/libri/elimina/{id}`  | Elimina un libro       |

## 🧪 Test

Puoi eseguire i test con:

```bash
mvn test
```

## 📄 Licenza

Questo progetto è distribuito sotto la licenza **MIT**.

---

👨‍💻 **Autore:** [Pierpaolo Di Dato](https://github.com/pierpaolo1989)