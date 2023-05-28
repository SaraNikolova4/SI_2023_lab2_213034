2)Control Flow Graph

![Graf](https://github.com/SaraNikolova4/SE/assets/126294104/4d056b45-9c19-4310-87d7-4c60eb3dc549)


3)Цикломатска комплексност

Цикломатската комплексност на овој код е 11, истата може да се добие на различни начини.

Бројот на региони 11.
бројот на предикатни јазли + 1 (10+1=11)
бројот на темиња - број на ребра + 2 (25-16+2= 11)


4)Тест случаи според критериумот Every Branch
1. Тест случај кога не е внесено ништо User (user = null, password=null, mail = null)
2. Тест случја кога корисникот не внесува име, неговата лозинка е помала од 8 постои неговиот маил User( username = null, pass = sara mail = sara@.) and alluser = 2 (postoi mail)
3.Тест случај кога корисникот внесува има, има лозинка поголема од 8 и без празни места, постои неговото има и не постои неговиот маил User (username = sara, pass = SARA12345 mail = sara) user =2.
4. Тест кога бројот на претходни корисници е 0, и лозинката има празни места User ( username = teo pass=SARA 1234. mail =sara@.) alluser = 0
5. Тест кога лозинката нема празни места, поголема е од 8 и има специјален знак User (username = sara, pass = SARA@1234 mail = sara) user =2 (poatoi toa ime I ne postoi toj mail)

![Screenshot_1](https://github.com/SaraNikolova4/SE/assets/126294104/26901f46-f109-4bd4-95c5-693e686a57b6)



5)Multiple Condition Тест случаи според критериумот Multiple Condition за условот. Постојат 4 тест случаи за овој услов.
if(user==null || user.getPassword()==null || user.getEmail()==null)

1. Ако не е внесено ниту име, ниту лозинка, ниту маил - враќа False
2. Ако е внесено име тогаш не е важно дали е внесена лозинка им маил - враќа True
3. Aко не е внесено име, внесена е лозинка и не е вашно дали е внесен маил - враќа True
4. Aко не е внесено име, не е внесена лозинка, тогаш мора да се внесе маил - врќа True.

![5](https://github.com/SaraNikolova4/SE/assets/126294104/d4a62e9e-b201-4d01-a834-bd6d4c130a58)
