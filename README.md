# Project-Bookshelf-App
https://developer.android.com/codelabs/basic-android-kotlin-compose-bookshelf

Practice makes a master.   
This main branch is the main directory.   

There are 2 branchs for 1 practice, Compose and SwiftUI.   
   
• [Compose branch](https://github.com/Jaehwa-Noh/Project-Bookshelf-App/tree/compose-bookshelf-app)   
• [SwiftUI branch]   


---

연습이 장인을 만든다.   
이 메인 브랜치는 메인 폴더입니다.

1개의 연습에 컴포즈와 스위프트유아이 2개의 브랜치가 있습니다.   
   
• [컴포즈 브랜치](https://github.com/Jaehwa-Noh/Project-Bookshelf-App/tree/compose-bookshelf-app)   
• [스위프트유아이 브랜치]   


## Bookshelf App (책장 앱)
This app shows books list to user using the Google Books API. (이 앱은 Google Books API를 사용하여 사용자에게 책 목록을 보여주는 앱입니다.)


## UI specifications (UI 명세서)
### Full screen (전체 화면)
<img width="300" alt="Full screen of Bookshelf app (책장 앱 전체 화면)" src="https://github.com/Jaehwa-Noh/Project-Bookshelf-App/assets/48680511/d1cf46e7-104a-4e08-8ff0-e7d1fca52029">

## Network API specifications (네트워크 API 명세서)
### [Google Books API v1](https://developers.google.com/books/docs/v1/using#PerformingSearch)
#### Performing a search (찾기)
URI: GET https://www.googleapis.com/books/v1/volumes?q=search+terms

##### Response (응답)
```html
200 OK

{
 "kind": "books#volumes",
 "items": [
  {
   "kind": "books#volume",
   "id": "_ojXNuzgHRcC",
   "etag": "OTD2tB19qn4",
   "selfLink": "https://www.googleapis.com/books/v1/volumes/_ojXNuzgHRcC",
   "volumeInfo": {
    "title": "Flowers",
    "authors": [
     "Vijaya Khisty Bodach"
    ],
   ...
  },
  {
   "kind": "books#volume",
   "id": "RJxWIQOvoZUC",
   "etag": "NsxMT6kCCVs",
   "selfLink": "https://www.googleapis.com/books/v1/volumes/RJxWIQOvoZUC",
   "volumeInfo": {
    "title": "Flowers",
    "authors": [
     "Gail Saunders-Smith"
    ],
    ...
  },
  {
   "kind": "books#volume",
   "id": "zaRoX10_UsMC",
   "etag": "pm1sLMgKfMA",
   "selfLink": "https://www.googleapis.com/books/v1/volumes/zaRoX10_UsMC",
   "volumeInfo": {
    "title": "Flowers",
    "authors": [
     "Paul McEvoy"
    ],
    ...
  },
  "totalItems": 3
}
```

#### Retrieving a specific volume (특정 책 찾기)
URI: GET https://www.googleapis.com/books/v1/volumes/zyTCAlFPjgYC?key=yourAPIKey

##### Response (응답)
```html
200 OK

{
 "kind": "books#volume",
 "id": "zyTCAlFPjgYC",
 "etag": "f0zKg75Mx/I",
 "selfLink": "https://www.googleapis.com/books/v1/volumes/zyTCAlFPjgYC",
 "volumeInfo": {
  "title": "The Google story",
  "authors": [
   "David A. Vise",
   "Mark Malseed"
  ],
  "publisher": "Random House Digital, Inc.",
  "publishedDate": "2005-11-15",
  "description": "\"Here is the story behind one of the most remarkable Internet
  successes of our time. Based on scrupulous research and extraordinary access
  to Google, ...",
  "industryIdentifiers": [
   {
    "type": "ISBN_10",
    "identifier": "055380457X"
   },
   {
    "type": "ISBN_13",
    "identifier": "9780553804577"
   }
  ],
  "pageCount": 207,
  "dimensions": {
   "height": "24.00 cm",
   "width": "16.03 cm",
   "thickness": "2.74 cm"
  },
  "printType": "BOOK",
  "mainCategory": "Business & Economics / Entrepreneurship",
  "categories": [
   "Browsers (Computer programs)",
   ...
  ],
  "averageRating": 3.5,
  "ratingsCount": 136,
  "contentVersion": "1.1.0.0.preview.2",
  "imageLinks": {
   "smallThumbnail": "https://books.google.com/books?id=zyTCAlFPjgYC&printsec=frontcover&img=1&zoom=5&edge=curl&source=gbs_api",
   "thumbnail": "https://books.google.com/books?id=zyTCAlFPjgYC&printsec=frontcover&img=1&zoom=1&edge=curl&source=gbs_api",
   "small": "https://books.google.com/books?id=zyTCAlFPjgYC&printsec=frontcover&img=1&zoom=2&edge=curl&source=gbs_api",
   "medium": "https://books.google.com/books?id=zyTCAlFPjgYC&printsec=frontcover&img=1&zoom=3&edge=curl&source=gbs_api",
   "large": "https://books.google.com/books?id=zyTCAlFPjgYC&printsec=frontcover&img=1&zoom=4&edge=curl&source=gbs_api",
   "extraLarge": "https://books.google.com/books?id=zyTCAlFPjgYC&printsec=frontcover&img=1&zoom=6&edge=curl&source=gbs_api"
  },
  "language": "en",
  "infoLink": "https://books.google.com/books?id=zyTCAlFPjgYC&ie=ISO-8859-1&source=gbs_api",
  "canonicalVolumeLink": "https://books.google.com/books/about/The_Google_story.html?id=zyTCAlFPjgYC"
 },
 "saleInfo": {
  "country": "US",
  "saleability": "FOR_SALE",
  "isEbook": true,
  "listPrice": {
   "amount": 11.99,
   "currencyCode": "USD"
  },
  "retailPrice": {
   "amount": 11.99,
   "currencyCode": "USD"
  },
  "buyLink": "https://books.google.com/books?id=zyTCAlFPjgYC&ie=ISO-8859-1&buy=&source=gbs_api"
 },
 "accessInfo": {
  "country": "US",
  "viewability": "PARTIAL",
  "embeddable": true,
  "publicDomain": false,
  "textToSpeechPermission": "ALLOWED_FOR_ACCESSIBILITY",
  "epub": {
   "isAvailable": true,
   "acsTokenLink": "https://books.google.com/books/download/The_Google_story-sample-epub.acsm?id=zyTCAlFPjgYC&format=epub&output=acs4_fulfillment_token&dl_type=sample&source=gbs_api"
  },
  "pdf": {
   "isAvailable": false
  },
  "accessViewStatus": "SAMPLE"
 }
}
```
