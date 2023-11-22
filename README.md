# Привіт, Дія! :)

Це тестове завдання, яке було зроблено Ярославом Урбановичем на позицію Automation QA. Нажаль, я не мав змогу протестувати IOS, тому тут желать лише Android тести.

# Інструкція по запуску:
1. ## Встановлення Java:
   ### Завантаження та встановлення JDK (Java Development Kit):
   * Завантажте JDK з офіційного веб-сайту Oracle: https://www.oracle.com/java/technologies/javase-downloads.html
   * Для цього проекту я використовую 17 версією. Рекомендую використовувати її, але за бажанням можно спробувати версії вище.
   ### Налаштування змінних середовища:
   * Додайте шлях до папки bin вашого встановленого JDK до змінної середовища PATH.
   * Додайте нову змінну середовища JAVA_HOME і встановіть її значенням шлях до вашого встановленого JDK.
2. ## Встановлення IntelliJ IDEA:
   ### Завантаження та встановлення IntelliJ IDEA:
   * Завантажте IntelliJ IDEA Community або Ultimate з офіційного веб-сайту: https://www.jetbrains.com/idea/download/
   * Встановіть IntelliJ IDEA, виконавши інструкції для вашої операційної системи.
   ### Налаштування проекту в IntelliJ IDEA:
   * Відкрийте IntelliJ IDEA та створіть новий проект або відкрийте існуючий.
   * Перейдіть до налаштувань проекту і виберіть JDK, який ви встановили раніше.
3. ## Встановлення Android Studio та налаштування Android SDK:
   ### Встановлення Android Studio:
   * Завантажте та встановіть Android Studio за допомогою офіційного веб-сайту Android: https://developer.android.com/studio
   ### Запуск Android Studio та встановлення SDK:
   * Відкрийте Android Studio та створіть новий проект, або відкрийте існуючий.
   * У налаштуваннях проекту виберіть "SDK Manager" або "AVD Manager".
   * Встановіть пакети SDK: для тестування я використовув Pixel 7 з Android 13.
   * Після завантаження запустити емулятор та перевірити, чи все добре запустилося.
4. ## Встановлення Appium:
   ### Встановлення Node.js:
   * Завантажте та встановіть Node.js і npm за допомогою офіційного веб-сайту Node.js: https://nodejs.org/
   ### Встановлення Appium:
   * Відкрийте термінал або командний рядок та введіть команду:
   ```sh
   npm install -g appium
   ```
   ### Запуск Appium Server:
   * В терміналі введіть команду (оскільки не знаю, з якою ОС будуть запускатися тести не робив автоматизацію створення серверу):
   ```sh
   appium
      ```

5. ## Копіювання репозиторію та фінальне налаштування:
   * Відкрийте термінал та введіть наступну команду, щоб скопіювати репозиторій на ваш комп'ютер:

   ```sh
   git clone https://github.com/Urbanovych/Diia-Test-Task.git
   ```
* Завантажте застосунок "Дія" з офіційного Google Play Market або іншого магазину додатків, якщо ви використовуєте справжнє Android-пристрій.
* Відкрийте файл AndroidDriver.properties, який зазвичай знаходиться в кореневій папці вашого проекту.

* Знайдіть рядок, що виглядає приблизно так:
   ```sh
   appPath=/шлях/до/вашого/apk/файлу/Diia.apk
   ```
  Де /шлях/до/вашого/apk/файлу/Diia.apk - це шлях до вашого файлу .apk. Замініть цей шлях на актуальний шлях до вашого застосунку "Дія", який ви будете використовувати для тестування.
   * Тепер ви повинні бути готові до запуску тестів!

# Трохи про тести:
Тести розділені на 2 файли: LandscapeBankIdTest та PortraitBankIdTest. Це пов'язанно з тим, що не вдалося автоматизувати поворот екрану (скоріш за все бо він програмно заблокований у застосунку). Тому для правильного флоу тестування перед запуску Landscape тесту потрібно мануально повернути екран емулятора та навпаки для Portrait тестів.

## [Відео з запуском тестів][myRecord-url]



# Бажаю Вам гарного дня та буду радий фідбеку! Слава Україні! 

<!-- MARKDOWN LINKS & IMAGES -->
[myRecord-url]: https://youtu.be/Iu7sOPbakH4
