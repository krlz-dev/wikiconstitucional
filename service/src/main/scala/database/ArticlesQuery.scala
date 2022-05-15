package database

import slick.jdbc.PostgresProfile.api._
import slick.jdbc.SQLActionBuilder

class ArticlesQuery {
  def getArticleDataQuery(articleId: String): SQLActionBuilder = {
    sql"""
            SELECT
                articulo.titulo as article_titulo,
                articulo.articulotranscrito as article_contenido,
                articulo.presentacion as article_presentacion,
                articulo.descripcion as article_descripcion,
                articulo.tratamientoc as article_tratamiento_en_constitution,
                articulo.tratamientoa as article_tratamiento_en_actas,
                articulo.alcancereservalegal as article_alcance_reserva_legal,
                articulo.bibliografia as article_bibliografia,
                articulo.webgrafia as article_webgrafia,
                articulo.documentoslegales as article_documentos_legales,
                articulo.archivosyresoluciones as article_archivos_resoluciones,
                articulo.fecha as article_last_update
            FROM dbo_articulo as articulo
            WHERE articulo.id = '#$articleId'
       """
  }

  def getAnalysisDataQuery(articleId: String): SQLActionBuilder = {
    sql"""SELECT
             analisis.titulo as section_titulo,
             analisis.tipo as section_tipo,
             analisis.contenido as section_contenido,
             analisis.concordancias as section_concordancias,
             analisis.fecha as section_last_update
         FROM dbo_analisis as analisis
         WHERE analisis.id = '#$articleId'
         """
  }
}
