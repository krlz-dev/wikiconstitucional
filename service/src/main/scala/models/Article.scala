package models

case class Article(article_titulo: String,
                   article_contenido: String,
                   article_presentacion: String,
                   article_descripcion: String,
                   article_tratamiento_en_constitution: String,
                   article_tratamiento_en_actas: String,
                   article_alcance_reserva_legal: String,
                   article_bibliografia: String,
                   article_webgrafia: String,
                   article_documentos_legales: String,
                   article_archivos_resoluciones: String,
                   article_last_update: String,
                   article_sections:List[Section])
