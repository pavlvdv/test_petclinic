# language: ru
@ru
Функциональность: Всё

  Структура сценария: Открыть раздел меню
    Дано пользователь находится на главной странице сайта
    Когда пользователь нажимает в меню на "<Раздел>"
    Тогда пользователь видит заголовок страницы "<Заголовок>"

    Примеры:
      | Раздел        | Заголовок     |
      | HOME          | Welcome       |
      | Find Owners   | Find Owners   |
      | Veterinarians | Veterinarians |

  Структура сценария: Поиск владельцев
    Дано пользователь находится на странице Find owners
    Когда пользователь вводит наименование владельца <Владелец> в поле Last name
    И пользователь нажимает кнопку "Find Owner"
    Тогда пользователь видит "<Результат поиска>"

    Примеры:
      | Владелец | Результат поиска |
      | ""       | Список из 10 владельцев |
      | "Franklin" | Карточка владельца    |
      | "George"   | Никто не найден       |








