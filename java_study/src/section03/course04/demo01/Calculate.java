package section03.course04.demo01;

public class Calculate {
    final float PI = 3.14159f;

    //求圆形的面积
    public float getArea(float r){
        float area = PI * r * r;
        return area;
    }
    //求矩形的面积  重载getArea()方法
    public float getArea(float l, float w){
        float area = l * w;
        return area;
    }

    public static void main(String [] args){
        Calculate calculate = new Calculate();
        float l = 20;
        float w = 30;
        float areaRectangle = calculate.getArea(l,w);
        System.out.println("求长为"+l+",宽为"+w+"的矩形的面积是：" + areaRectangle);

        float r = 7;
        float areaCirc = calculate.getArea(r);
        System.out.println("求半径为"+r+"的圆的面积是："+areaCirc);

    }



}
