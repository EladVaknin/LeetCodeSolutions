class Singleton
{
    private:
       // יצירת המצביע . */
        static Singleton* instance;

        /* בנאי פרטי – שלא ניתן לגשת אליו – הופעה יחידה.. */
        Singleton();

    public:
        //מתודה שכן ניתן לגשת אליה.. */
        static Singleton* getInstance();
};

/* Null, because instance will be initialized on demand. */
Singleton* Singleton::instance = 0;

// מימוש המתודה
Singleton* Singleton::getInstance()
{
    if (instance == 0)
    {
        instance = new Singleton();
    }

    return instance;
}

Singleton::Singleton()
{}