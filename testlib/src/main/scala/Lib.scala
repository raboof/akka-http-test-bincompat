import akka.http.scaladsl.HttpsConnectionContext

object Lib {
  def doIt() = {
    new HttpsConnectionContext(null)
  }
}
