# News Appliction backend

## Setup & Installation

1. Use any Java ide with spring boot installed
2. Clone the repository and import in your Ide
3. get API key from website mentioned below and to AppService.java
```
  https://newsapi.org/
```
4. you are ready to go.

Demostration:

Request: GET
```
  http://localhost:8080/api/getSource
```
Response:
```
  {
  "status": "ok",
  "sources": [
    {
      "id": "abc-news",
      "name": "ABC News",
      "description": "Your trusted source for breaking news, analysis, exclusive interviews, headlines, and videos at ABCNews.com.",
      "url": "https://abcnews.go.com",
      "category": "general",
      "language": "en",
      "country": "us"
    },
    {
      "id": "abc-news-au",
      "name": "ABC News (AU)",
      "description": "Australia's most trusted source of local, national and world news. Comprehensive, independent, in-depth analysis, the latest business, sport, weather and more.",
      "url": "http://www.abc.net.au/news",
      "category": "general",
      "language": "en",
      "country": "au"
    }
   }
  ]
 }
```
