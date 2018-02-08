[![Follow @HANIBAW](https://img.shields.io/github/followers/espadrine.svg?style=social&label=Follow)](https://www.instagram.com/?hl=th) 
[![Follow @HANIBAW](	https://img.shields.io/github/stars/badges/shields.svg?style=social&label=Stars)
[![Follow @HANIBAW](https://img.shields.io/github/followers/espadrine.svg?style=social&label=Follow)](https://www.instagram.com/?hl=th) 

# Data structure and algorithm
Data Structure คือการรูปแบบการจัดระเบียบของข้อมูลมีหลากหลายรูปแบบเช่น
* เขตข้อมูล(Field)
* แถวลำดับ(Array)
* ระเบียน(Record)
* ต้นไม้(Tree)
* ลิงค์ลิสต์(Link List) 

# Array 2D JAVA

You can define a 2D array in Java as follows 

```java
int[][] Geese = new int[4][2];// 2D integer array with 4 rows and 2 columns 
String[][] Ducks = new String[3][3]; // 2D String array with 3 rows and 3 columns
```
Example:
```java
public static boolean isLowerTriangular(int[][] d){
        boolean YesNo=true;
        int k=0;
        int s=d.length;
        for(int i=0;i<d.length;i++){
            k++;
            for(int j=k;j<d[i].length;j++){
                if(d[i][j]!=0){
                    YesNo=false;
                }
                }
            }
        if(YesNo==true){
            return YesNo;
        }
        YesNo=true;
        for(int i=d.length-1;i>0;i--){
            s--;
            for(int j=0;j<s;j++){
                if(d[i][j]!=0){
                    YesNo=false;
                    break;
                }
            }
            
        }
        return YesNo;
    }
```
![Example](https://github.com/hanza0041/Data-Structure-And-Algorithm-/isLower.png""Example")
