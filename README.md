# BibliotekaJava
Ćwiczenie ze Springa
Stwórz program zawierający dwie klasy: Książka i Wypożyczający. Książka ma posiadać następujące pola:
*nazwa* <br/>
*autor *<br/>
*dostepnosc (czy mozna ja wyporzyczyc, czy juz ktos zrobil to wczesniej) *<br/>
Ma również zawierać odpowiednie gettery i settery oraz metodę toString.<br/>
Klasa Wypożyczający musi posiadać następujące pola: <br/>
*imie*<br/>
*nazwisko*<br/>
*ksiazka (typu Ksiazka)*<br/>
*timeZone (z klasy util, zawiera w sobie informacje o strefie czasowej w jakiej znajduje się wypożyczający)*<br/>
Klasa ta ma również zawierać konstruktor, metode wypozyczKsiazke, która sprawdza czy dana książka została już wypożyczone i jeśli tak to zwraca o tym odpowiednią informacje, a jeśli nie to ustawia dostępnosc na false i ustawia pole ksiazka. Oprócz tego powinna też posiadać metodę zwroc w ktorej ksiazki sa zwracane ( dostepnosc ustawiona na true) oraz metodę toString.<br/>
Należy stworzyć do tego odpowiednią konfiguracje Javową - adnotacje. Wszystkie książki (tytul, autor i dostepnosc) mają być zczytane z pliku konfiguracyjnego setting.propierties. Scieżkę do pliku należy podać jako argument do maszyny wirtualnej javy. Strafa czasowa ma być podana jako stala zczytana z util. Plik konfiguracyjny musi byc w całości napisany w Javie. 
