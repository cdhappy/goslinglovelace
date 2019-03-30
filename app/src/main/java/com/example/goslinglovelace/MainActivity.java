package com.example.goslinglovelace;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.media.VolumeShaper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private TextView txt1 ;
    private TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER);
        int orientation = getResources().getConfiguration().orientation;
        if(orientation == Configuration.ORIENTATION_LANDSCAPE)
        {
            setContentView(R.layout.main1);
            txt2 = (TextView)findViewById(R.id.text2);
            String language=getResources().getConfiguration().locale.getLanguage();
            if(language.equals("zh"))
            {
                txt2.setText("奥古斯塔·阿达·金，洛夫蕾丝伯爵夫人（N_e拜伦，1815年12月10日至1852年11月27日）是英国数学家和作家，主要以其在查尔斯·巴贝奇提出的通用机械计算机分析机上的工作而闻名。她是第一个认识到这台机器有超出纯计算的应用程序的人，并且发表了第一个打算由这种机器执行的算法。因此，她有时被认为是第一个认识到计算机的全部潜力的人，也是第一批计算机程序员之一。洛夫蕾丝是诗人拜伦勋爵和他的妻子安妮伊莎贝拉·安娜贝拉·米尔班克，温特沃斯夫人唯一合法的孩子。拜伦的所有其他孩子都是非婚生的。拜伦在艾达出生一个月后与妻子分居，四个月后离开了英国。他用一首诗来纪念离别，诗的开头是，你的脸像你母亲的我美丽的孩子！艾达！我的房子和心的独生女？艾达八岁时，他在希腊独立战争中死于疾病。她的母亲仍然很苦恼，并促进了艾达对数学和逻辑的兴趣，以防止她发展她父亲的精神错乱。尽管如此，艾达仍然对拜伦很感兴趣，并在拜伦死后，应拜伦的请求埋葬在他旁边。她小时候经常生病。艾达于1835年与威廉·金结婚。1838年，国王被任命为洛夫蕾丝伯爵，艾达因此成为洛夫蕾丝伯爵夫人。");
            }

            else
            {
                txt2.setText("Augusta Ada King, Countess of Lovelace (née Byron; 10 December 1815 – 27 November 1852) was an English mathematician and writer, chiefly known for her work on Charles Babbage's proposed mechanical general-purpose computer, the Analytical Engine. She was the first to recognise that the machine had applications beyond pure calculation, and published the first algorithm intended to be carried out by such a machine. As a result, she is sometimes regarded as the first to recognise the full potential of a computing machine and one of the first computer programmers.Lovelace was the only legitimate child of the poet Lord Byron and his wife Anne Isabella Annabella Milbanke, Lady Wentworth.All of Byron's other children were born out of wedlock to other women. Byron separated from his wife a month after Ada was born and left England forever four months later. He commemorated the parting in a poem that begins, Is thy face like thy mother's my fair child! ADA! sole daughter of my house and heart? He died of disease in the Greek War of Independence when Ada was eight years old. Her mother remained bitter and promoted Ada's interest in mathematics and logic in an effort to prevent her from developing her father's perceived insanity. Despite this, Ada remained interested in Byron and was, upon her eventual death, buried next to him at her request. She was often ill in her childhood. Ada married William King in 1835. King was made Earl of Lovelace in 1838, Ada thereby becoming Countess of Lovelace. ");
            }

            //txt2.setText("Augusta Ada King, Countess of Lovelace (née Byron; 10 December 1815 – 27 November 1852) was an English mathematician and writer, chiefly known for her work on Charles Babbage's proposed mechanical general-purpose computer, the Analytical Engine. She was the first to recognise that the machine had applications beyond pure calculation, and published the first algorithm intended to be carried out by such a machine. As a result, she is sometimes regarded as the first to recognise the full potential of a computing machine and one of the first computer programmers.Lovelace was the only legitimate child of the poet Lord Byron and his wife Anne Isabella Annabella Milbanke, Lady Wentworth.All of Byron's other children were born out of wedlock to other women. Byron separated from his wife a month after Ada was born and left England forever four months later. He commemorated the parting in a poem that begins, Is thy face like thy mother's my fair child! ADA! sole daughter of my house and heart? He died of disease in the Greek War of Independence when Ada was eight years old. Her mother remained bitter and promoted Ada's interest in mathematics and logic in an effort to prevent her from developing her father's perceived insanity. Despite this, Ada remained interested in Byron and was, upon her eventual death, buried next to him at her request. She was often ill in her childhood. Ada married William King in 1835. King was made Earl of Lovelace in 1838, Ada thereby becoming Countess of Lovelace. ");
        }


        else if(orientation == Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.activity_main);
            txt1 = (TextView) findViewById(R.id.text1);
            String language=getResources().getConfiguration().locale.getLanguage();
            if(language.equals("zh"))
            {
                txt1.setText("詹姆斯戈斯林获得卡尔加里大学理学学士学位，卡内基梅隆大学计算机科学硕士和博士学位。他在攻读博士学位的同时，写了一个名为戈斯林EMacs（gosmacs）的EMacs版本。他在卡内基梅隆大学（Carnegie Mellon Un）为16路计算机系统构建了一个多处理器版本的Unix。在加入Sun Microsystems之前。他还开发了一些编译器和邮件系统。1984年至2010年（26年）期间，戈斯林与太阳微系统公司合作。他被称为Java编程语言之父，他通过编写Pyq程序将软件从Pyq写入到端口软件，并将PQ Q代码翻译成VAX汇编程序并模拟硬件。他在2010年4月2日被甲骨文公司收购后，离开了Sun MyStices，引用了工资、状态和DECISI的减少。论能力的培养，以及角色的转变和伦理挑战。");

            }
            else
            {
                txt1.setText("James Gosling received a Bachelor of Science from the University of Calgary and his M.A. and Ph.D. from Carnegie Mellon University, all in computer science.He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate.He built a multi-processor version of Unix for a 16-way computer system while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there. Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He is known as the father of the Java programming language.He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware.He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation,citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges.");

            }
            //txt1.setText("James Gosling received a Bachelor of Science from the University of Calgary and his M.A. and Ph.D. from Carnegie Mellon University, all in computer science.He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate.He built a multi-processor version of Unix for a 16-way computer system while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there. Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He is known as the father of the Java programming language.He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware.He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation,citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges.");

        }

    }
}
