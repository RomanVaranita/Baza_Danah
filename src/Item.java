public class Item {

  // Для каждого товара необходимо знать следующие вещи:
  // артикул - уникальная строка
  final private String article;
  // название - строка
  private String title;
  // стоимость - специальный класс Деньги
  private Money price;

  public Item(String article, String title, Money price) {
    this.article = article; // атрибут объекта = аргумент конструктора
    this.title = title;
    this.price = price;
  }

  public String getArticle() {
    return article;
  }

  public String getTitle() {
    return title;
  }

  public Money getPrice() {
    return price;
  }

  // нет setArticle() - нельзя поменять артикул, он final


  public void setTitle(String title) {
    this.title = title;
  }

  public void setPrice(Money price) {
    this.price = price;
  }

  // "фальшивый" геттер
  // вернём красивую строку для печати

  public String getItemString() {
    // "Товар (артикул: артикул), стоимость: красиваяСтоимость"
    return String.format("%s (артикул: %s), стоимость: %s", title, article, price.getMoneyString());
  }
}
