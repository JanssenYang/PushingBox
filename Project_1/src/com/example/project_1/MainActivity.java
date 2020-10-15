package com.example.project_1;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends Activity {

	
	TextView t[] = new TextView[4];
	TextView exp1, exp2, exp3, exp4, exp5;
	TextView exp;
	Integer[] ids=new Integer[]{R.id.t0,R.id.t1,R.id.t2,R.id.t3};
	TextView map[][] = new TextView[14][14];
	Integer[][] map_id=new Integer[][]{{R.id.map0000,R.id.map0001,R.id.map0002,
			R.id.map0003,R.id.map0004,R.id.map0005,R.id.map0006,R.id.map0007,
			R.id.map0008,R.id.map0009,R.id.map0010,R.id.map0011,R.id.map0012,
			R.id.map0013},
			{R.id.map0100,R.id.map0101,R.id.map0102,R.id.map0103,R.id.map0104,
			R.id.map0105,R.id.map0106,R.id.map0107,R.id.map0108,R.id.map0109,
			R.id.map0110,R.id.map0111,R.id.map0112,R.id.map0113},
			{R.id.map0200,R.id.map0201,R.id.map0202,R.id.map0203,R.id.map0204,
			R.id.map0205,R.id.map0206,R.id.map0207,R.id.map0208,R.id.map0209,
			R.id.map0210,R.id.map0211,R.id.map0212,R.id.map0213},
			{R.id.map0300,R.id.map0301,R.id.map0302,R.id.map0303,R.id.map0304,
			R.id.map0305,R.id.map0306,R.id.map0307,R.id.map0308,R.id.map0309,
			R.id.map0310,R.id.map0311,R.id.map0312,R.id.map0313},
			{R.id.map0400,R.id.map0401,R.id.map0402,R.id.map0403,R.id.map0404,
			R.id.map0405,R.id.map0406,R.id.map0407,R.id.map0408,R.id.map0409,
			R.id.map0410,R.id.map0411,R.id.map0412,R.id.map0413},
			{R.id.map0500,R.id.map0501,R.id.map0502,R.id.map0503,R.id.map0504,
			R.id.map0505,R.id.map0506,R.id.map0507,R.id.map0508,R.id.map0509,
			R.id.map0510,R.id.map0511,R.id.map0512,R.id.map0513},
			{R.id.map0600,R.id.map0601,R.id.map0602,
			R.id.map0603,R.id.map0604,R.id.map0605,R.id.map0606,R.id.map0607,
			R.id.map0608,R.id.map0609,R.id.map0610,R.id.map0611,R.id.map0612,
			R.id.map0613},
			{R.id.map0700,R.id.map0701,R.id.map0702,R.id.map0703,R.id.map0704,
			R.id.map0705,R.id.map0706,R.id.map0707,R.id.map0708,R.id.map0709,
			R.id.map0710,R.id.map0711,R.id.map0712,R.id.map0713},
			{R.id.map0800,R.id.map0801,R.id.map0802,R.id.map0803,R.id.map0804,
			R.id.map0805,R.id.map0806,R.id.map0807,R.id.map0808,R.id.map0809,
			R.id.map0810,R.id.map0811,R.id.map0812,R.id.map0813},
			{R.id.map0900,R.id.map0901,R.id.map0902,
			R.id.map0903,R.id.map0904,R.id.map0905,R.id.map0906,R.id.map0907,
			R.id.map0908,R.id.map0909,R.id.map0910,R.id.map0911,R.id.map0912,
			R.id.map0913},
			{R.id.map1000,R.id.map1001,R.id.map1002,R.id.map1003,R.id.map1004,
			R.id.map1005,R.id.map1006,R.id.map1007,R.id.map1008,R.id.map1009,
			R.id.map1010,R.id.map1011,R.id.map1012,R.id.map1013},
			{R.id.map1100,R.id.map1101,R.id.map1102,R.id.map1103,R.id.map1104,
			R.id.map1105,R.id.map1106,R.id.map1107,R.id.map1108,R.id.map1109,
			R.id.map1110,R.id.map1111,R.id.map1112,R.id.map1113},
			{R.id.map1200,R.id.map1201,R.id.map1202,
			R.id.map1203,R.id.map1204,R.id.map1205,R.id.map1206,R.id.map1207,
			R.id.map1208,R.id.map1209,R.id.map1210,R.id.map1211,R.id.map1212,
			R.id.map1213},
			{R.id.map1300,R.id.map1301,R.id.map1302,R.id.map1303,R.id.map1304,
			R.id.map1305,R.id.map1306,R.id.map1307,R.id.map1308,R.id.map1309,
			R.id.map1310,R.id.map1311,R.id.map1312,R.id.map1313},};
	int hero, aim[] = new int[6],box[] = new int [6];
	int wall[] = new int[200],key=0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		for( int i=0; i<4; i++ )
			t[i] = (TextView)findViewById(ids[i]);
		exp = (TextView)findViewById(R.id.exp);
		exp1 = (TextView)findViewById(R.id.exp1);
		exp2 = (TextView)findViewById(R.id.exp2);
		exp3 = (TextView)findViewById(R.id.exp3);
		exp4 = (TextView)findViewById(R.id.exp4);
		exp5 = (TextView)findViewById(R.id.exp5);
		
		for( int i=0; i<14; i++ )
			for(int j=0; j<14; j++)
				map[i][j] = (TextView)findViewById(map_id[i][j]);
		//四周画上墙壁
		for( int i=0; i<14; i++ )
		{
			map[i][0].setBackgroundColor(Color.BLACK);
			wall[key] = i*100+0; key++;
			map[0][i].setBackgroundColor(Color.BLACK);
			wall[key] = 0*100+i; key++;
			map[i][13].setBackgroundColor(Color.BLACK);
			wall[key] = i*100+13; key++;
			map[13][i].setBackgroundColor(Color.BLACK);
			wall[key] = 13*100+i; key++;
		}
		for( int i=1; i<=4; i++ )
		{
			map[i][3].setBackgroundColor(Color.BLACK);
			wall[key] = i*100+3; key++;
		}
		for( int i=2; i<=5; i++ )
		{
			map[i][9].setBackgroundColor(Color.BLACK);
			wall[key] = i*100+9; key++;
		}
		for( int i=9; i<=11; i++ )
		{
			map[5][i].setBackgroundColor(Color.BLACK);
			wall[key] = 5*100+i; key++;
		}
		for( int i=5; i<=9; i++ )
		{
			map[7][i].setBackgroundColor(Color.BLACK);
			wall[key] = 7*100+i; key++;
		}
		//将人物、箱子、目标的初始位置设置在屏幕
		hero = 606;
		aim[0] = 204; aim[1] = 1202; aim[2] = 805; aim[3] = 410; aim[4] = 612; aim[5] = 305;
		box[0] = 202; box[1] = 307; box[2] = 211; box[3] = 711; box[4] = 909; box[5] = 1106;
		//绘制人物、箱子、目标
		map[hero/100][hero%100].setBackgroundResource(R.drawable.hero);
		exp1.setBackgroundResource(R.drawable.hero);
		exp2.setBackgroundResource(R.drawable.box);
		exp3.setBackgroundResource(R.drawable.aim);
		exp4.setBackgroundColor(Color.WHITE);
		exp5.setBackgroundColor(Color.BLACK);
		for( int i=0; i<6; i++ )
		{
			map[aim[i]/100][aim[i]%100].setBackgroundResource(R.drawable.aim);
			map[box[i]/100][box[i]%100].setBackgroundResource(R.drawable.box);
		}
		
		 t[0].setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//t[0].setText("up receive");
					int a = -100;
					int hero2 = hero + a;
					//判断是否下一个格子是箱子
					int k;
					for( k=0; k<6; k++ )
						if( box[k] == hero2 ) break;
					if( k<6 )//是箱子
					{
						//t[0].setText("up box");
						int box2 = hero2 + a;
						//只有箱子后面是空地和目标时，能够移动
						for( k=0; k<6; k++ )
							if( box[k] == box2 ) break;
						if( k==6 )//不是箱子
						{
							int j;
							for( j=0; j<key; j++ )
								if( wall[j] == box2 )break;
							if( j == key )//不是墙
							{
								map[box2/100][box2%100].setBackgroundResource(R.drawable.box);
								map[hero2/100][hero2%100].setBackgroundResource(R.drawable.hero);
								//还原目标
								int i;
								for( i=0; i<6; i++ )
									if( aim[i] == hero ) break;
								if( i != 6 ) map[hero/100][hero%100].setBackgroundResource(R.drawable.aim);
								else map[hero/100][hero%100].setBackgroundColor(Color.WHITE);
							
								//移动箱子
								for( i=0; i<6; i++ )
									if( box[i] == hero2 )
									{
										box[i] = box2;
										break;
									}
								//移动人物
								hero = hero2;
							}
						}
					}
					//判断是否下一个格子是墙
					else{
						int q;
						for( q=0; q<key; q++ )
							if( wall[q] == hero2 ) break;
						if( q != key )//是墙
						{
						//不移动
							//t[0].setText("up wall");
							hero2 = hero;
						}
						//判断是否下一个格子是空地或者是目标
						else//地面和目标都可以走
						{
						//t[0].setText("up ground or aim");
						map[hero2/100][hero2%100].setBackgroundResource(R.drawable.hero);
						//退完了还原目标图像
						int i;
						for( i=0; i<6; i++ )
							if( aim[i] == hero ) break;
						if( i != 6 ) map[hero/100][hero%100].setBackgroundResource(R.drawable.aim);
						else map[hero/100][hero%100].setBackgroundColor(Color.WHITE);
						hero = hero2;
						}
					}
				}
		 });
		 t[1].setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//t[0].setText("up receive");
					int a = -1;
					int hero2 = hero + a;
					//判断是否下一个格子是箱子
					int k;
					for( k=0; k<6; k++ )
						if( box[k] == hero2 ) break;
					if( k<6 )//是箱子
					{
						//t[1].setText("left box");
						int box2 = hero2 + a;
						//只有箱子后面是空地和目标时，能够移动
						for( k=0; k<6; k++ )
							if( box[k] == box2 ) break;
						if( k==6 )//不是箱子
						{
							int j;
							for( j=0; j<key; j++ )
								if( wall[j] == box2 )break;
							if( j == key )//不是墙
							{
								map[box2/100][box2%100].setBackgroundResource(R.drawable.box);
								map[hero2/100][hero2%100].setBackgroundResource(R.drawable.hero);
								//还原目标
								int i;
								for( i=0; i<6; i++ )
									if( aim[i] == hero ) break;
								if( i != 6 ) map[hero/100][hero%100].setBackgroundResource(R.drawable.aim);
								else map[hero/100][hero%100].setBackgroundColor(Color.WHITE);
							
								//移动箱子
								for( i=0; i<6; i++ )
									if( box[i] == hero2 )
									{
										box[i] = box2;
										break;
									}
								//移动人物
								hero = hero2;
							}
						}
					}
					//判断是否下一个格子是墙
					else{
						int q;
						for( q=0; q<key; q++ )
							if( wall[q] == hero2 ) break;
						if( q != key )//是墙
						{
						//不移动
							//t[1].setText("left wall");
							hero2 = hero;
						}
						//判断是否下一个格子是空地或者是目标
						else//地面和目标都可以走
						{
						//t[1].setText("left ground or aim");
						map[hero2/100][hero2%100].setBackgroundResource(R.drawable.hero);
						//退完了还原目标图像
						int i;
						for( i=0; i<6; i++ )
							if( aim[i] == hero ) break;
						if( i != 6 ) map[hero/100][hero%100].setBackgroundResource(R.drawable.aim);
						else map[hero/100][hero%100].setBackgroundColor(Color.WHITE);
						hero = hero2;
						}
					}
				}
		 });
		 t[2].setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					// TODO Auto-generated method stub
					//t[0].setText("up receive");
					int a = 1;
					int hero2 = hero + a;
					//判断是否下一个格子是箱子
					int k;
					for( k=0; k<6; k++ )
						if( box[k] == hero2 ) break;
					if( k<6 )//是箱子
					{
						//t[2].setText("right box");
						int box2 = hero2 + a;
						//只有箱子后面是空地和目标时，能够移动
						for( k=0; k<6; k++ )
							if( box[k] == box2 ) break;
						if( k==6 )//不是箱子
						{
							int j;
							for( j=0; j<key; j++ )
								if( wall[j] == box2 )break;
							if( j == key )//不是墙
							{
								map[box2/100][box2%100].setBackgroundResource(R.drawable.box);
								map[hero2/100][hero2%100].setBackgroundResource(R.drawable.hero);
								//还原目标
								int i;
								for( i=0; i<6; i++ )
									if( aim[i] == hero ) break;
								if( i != 6 ) map[hero/100][hero%100].setBackgroundResource(R.drawable.aim);
								else map[hero/100][hero%100].setBackgroundColor(Color.WHITE);
							
								//移动箱子
								for( i=0; i<6; i++ )
									if( box[i] == hero2 )
									{
										box[i] = box2;
										break;
									}
								//移动人物
								hero = hero2;
							}
						}
					}
					//判断是否下一个格子是墙
					else{
						int q;
						for( q=0; q<key; q++ )
							if( wall[q] == hero2 ) break;
						if( q != key )//是墙
						{
						//不移动
							//t[2].setText("right wall");
							hero2 = hero;
						}
						//判断是否下一个格子是空地或者是目标
						else//地面和目标都可以走
						{
						//t[2].setText("right ground or aim");
						map[hero2/100][hero2%100].setBackgroundResource(R.drawable.hero);
						//退完了还原目标图像
						int i;
						for( i=0; i<6; i++ )
							if( aim[i] == hero ) break;
						if( i != 6 ) map[hero/100][hero%100].setBackgroundResource(R.drawable.aim);
						else map[hero/100][hero%100].setBackgroundColor(Color.WHITE);
						hero = hero2;
						}
					}
				}
		 });
		 t[3].setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					// TODO Auto-generated method stub
					////t[0].setText("up receive");
					int a = 100;
					int hero2 = hero + a;
					//判断是否下一个格子是箱子
					int k;
					for( k=0; k<6; k++ )
						if( box[k] == hero2 ) break;
					if( k<6 )//是箱子
					{
						//t[3].setText("down box");
						int box2 = hero2 + a;
						//只有箱子后面是空地和目标时，能够移动
						for( k=0; k<6; k++ )
							if( box[k] == box2 ) break;
						if( k==6 )//不是箱子
						{
							int j;
							for( j=0; j<key; j++ )
								if( wall[j] == box2 )break;
							if( j == key )//不是墙
							{
								map[box2/100][box2%100].setBackgroundResource(R.drawable.box);
								map[hero2/100][hero2%100].setBackgroundResource(R.drawable.hero);
								//还原目标
								int i;
								for( i=0; i<6; i++ )
									if( aim[i] == hero ) break;
								if( i != 6 ) map[hero/100][hero%100].setBackgroundResource(R.drawable.aim);
								else map[hero/100][hero%100].setBackgroundColor(Color.WHITE);
							
								//移动箱子
								for( i=0; i<6; i++ )
									if( box[i] == hero2 )
									{
										box[i] = box2;
										break;
									}
								//移动人物
								hero = hero2;
							}
						}
					}
					//判断是否下一个格子是墙
					else{
						int q;
						for( q=0; q<key; q++ )
							if( wall[q] == hero2 ) break;
						if( q != key )//是墙
						{
						//不移动
							//t[3].setText("down wall");
							hero2 = hero;
						}
						//判断是否下一个格子是空地或者是目标
						else//地面和目标都可以走
						{
						//t[3].setText("down ground or aim");
						map[hero2/100][hero2%100].setBackgroundResource(R.drawable.hero);
						//退完了还原目标图像
						int i;
						for( i=0; i<6; i++ )
							if( aim[i] == hero ) break;
						if( i != 6 ) map[hero/100][hero%100].setBackgroundResource(R.drawable.aim);
						else map[hero/100][hero%100].setBackgroundColor(Color.WHITE);
						hero = hero2;
						}
					}
				}
		 });
		 exp.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					// TODO Auto-generated method stub
					int i, j;
					for( i=0; i<6; i++ )
					{
						for( j=0; j<6; j++ )
						{
							if( box[j] == aim[i] )
								break;
						}
						//存在一个目标不再有箱子
						if( j==6 ) break;
					}
					//所有箱子都进行了尝试
					if( i==6 )
						exp.setText("Succeed!");
				}
		 }); 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
