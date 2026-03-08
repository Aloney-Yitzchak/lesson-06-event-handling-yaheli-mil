[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/yWy14IoI)
# שיעור 6: טיפול באירועים – Event Handling 📱

> **פרויקט Android מוכן לפתיחה ב-Android Studio**

---

## 🚀 הוראות התחלה מהירה

### שלב 1: שכפל את הפרויקט
```bash
git clone <כתובת-הריפו-שלך>
```

### שלב 2: פתח ב-Android Studio
1. פתח **Android Studio**
2. בחר **Open** → נווט לתיקיית הפרויקט
3. המתן ל-Gradle sync (זה לוקח דקה-שתיים)
4. **Run ▶** כדי לראות את האפליקציה הריקה

### שלב 3: השלם את הקוד
פתח את הקובץ:
```
app/src/main/java/com/example/template/MainActivity.java
```
וחפש את כל המקומות שכתוב `// TODO` — שם המשימה שלך!

---

## 📁 מבנה הפרויקט

```
Lesson06-EventHandling/
│
├── app/
│   └── src/
│       └── main/
│           ├── java/com/example/template/
│           │   └── MainActivity.java    ← 🎯 כאן תכתוב את הקוד!
│           │
│           └── res/
│               ├── layout/
│               │   └── activity_main.xml   ← Layout מוכן ✅
│               └── values/
│                   ├── strings.xml         ← כל הטקסטים
│                   ├── colors.xml          ← כל הצבעים
│                   └── themes.xml          ← עיצוב כללי
│
├── OBSERVATIONS.md    ← 📝 מלא בסוף השיעור (להגשה)
└── QUESTIONS.md       ← ❓ כתוב שאלות שעלו לך (להגשה)
```

---

## 🎯 מה צריך לבנות

**אפליקציית "שאל אותי!"** — אפליקציה שמגיבה למשתמש:

| פעולה | תוצאה |
|-------|--------|
| הקלדת שם + לחיצה על "ברוך הבא" | מציגה: "שלום, [שם]! ברוך הבא לאפליקציה!" |
| לחיצה על "נקה" | מנקה את שדה הטקסט ואת ההודעה |

### ה-Layout כבר מוכן עבורך! ✅

**IDs שתשתמש בהם ב-Java:**

| ID | סוג | שימוש |
|----|-----|--------|
| `editTextName` | `EditText` | קלט השם |
| `btnGreet` | `Button` | כפתור "ברוך הבא" |
| `btnClear` | `Button` | כפתור "נקה" |
| `textViewResult` | `TextView` | תצוגת הברכה |

---

## ✅ משימות (לפי סדר)

- [ ] **שלב א** — הצהר על 4 משתנים (EditText, Button, Button, TextView) בראש הקלאס
- [ ] **שלב ב** — חבר כל View עם `findViewById(R.id.___)`
- [ ] **שלב ג** — הוסף `OnClickListener` לכפתור "ברוך הבא"
- [ ] **שלב ד** — הוסף `OnClickListener` לכפתור "נקה"
- [ ] **בדיקה** — הרץ את האפליקציה ✓ לחץ ✓ ראה תוצאה ✓
- [ ] **הגשה** — מלא את `OBSERVATIONS.md` ו-`QUESTIONS.md`
- [ ] **Push** — דחוף ל-GitHub

---

## ⭐ אתגרים נוספים (רשות)

**אתגר 1:** בדוק שהשם לא ריק — אם ריק, הצג שגיאה באדום

**אתגר 2:** שנה את צבע הטקסט — ירוק להצלחה, אדום לשגיאה

**אתגר 3:** הוסף `LongClickListener` — לחיצה ארוכה מציגה את השם ב-UPPERCASE

*רמז לאתגר 1:*
```java
if (name.isEmpty()) { ... } else { ... }
```

*רמז לאתגר 2:*
```java
textViewResult.setTextColor(getResources().getColor(R.color.colorSuccess, null));
```

---

## 🔧 שגיאות נפוצות

| שגיאה | גורם | תיקון |
|-------|------|--------|
| `NullPointerException` | `findViewById` עם ID שגוי | בדוק שה-ID זהה ב-Java וב-XML |
| שגיאת compile על `getText()` | שכחת `.toString()` | כתוב `getText().toString()` |
| כפתור לא מגיב | שכחת `setOnClickListener` | הוסף את ה-Listener |
| הודעת Gradle error | לא חיכית ל-sync | המתן ל-sync ולחץ שוב |

---

## 💡 טיפים

- **תקוע?** שאל את ה-Gem! שלח לו את הקוד שלך ואת הודעת השגיאה
- **שגיאה אדומה?** `Build > Clean Project` ואז `Run` שוב
- **לא רואה שינויים?** לחץ על ▶ כדי לבנות ולהריץ מחדש

---

## 📤 הגשה

```bash
git add .
git commit -m "Lesson 6: Event Handling - [השם שלך]"
git push
```

> **חשוב:** לפני ה-push — ודא שה-Build עובד בלי שגיאות! (`Build > Make Project`)

---

*שיעור 6 | קורס פיתוח Android | כיתה י"א | כפר הנוער אלוני יצחק*
