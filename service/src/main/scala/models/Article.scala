package models

case class Article(title: String,
                   content: String,
                   presentation: String,
                   description: String,
                   treatmentInConstitution: String,
                   treatmentInActs: String,
                   reachOfLegalReserve: String,
                   bibliography: String,
                   webgraphy: String,
                   legalDocuments: String,
                   resolutionDocuments: String,
                   lastUpdate: String,
                   sections: List[Section]) extends HttpResponseModel
