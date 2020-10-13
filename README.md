### Android_Study
- 하루에 조금씩 복습합시다!
<hr />

```
Android Studio
Android 10.0(Q)
Android SDK Platform 29
AVD Pixel 2
```


<details>
<summary>9/2</summary>

### 안드로이드 개요
- 애플리케이션 프레임워크를 통해서 제공되는 API를 사용함으로써 코드를 재사용하여 효율적이고 빠른 애플리케이션 개발 가능
- 모바일 기기에 최적화된 달빅 또는 아트런타임 제공
- 2D 그래픽 및 삼차원 그래픽을 최적화하여 표현
- 모바일용 데이터베이스인 SQLite를 제공
- 각종 오디오, 비디오 및 이미지 형식을 지원
- 모바일 기기에 내장된 각종 하드웨어(블루투스, 카메라, 나침반, WiFi 등) 지원
- 이클립스 IDE 또는 Andorid Stdudio를 통해서 강력하고 빠른 개발 환경 제공

### 안드로이드 특징
- 안드로이드의 핵심 커널(Kernel) : 리눅스로 구성
- 안드로이드 애플리케이션 개발 언어 : JAVA
- 안드로이드 SDK에서 많은 라이브러리를 포함하고 있어 개발 용이
- 오픈 소스 지향
- 지속적인 업그레이드 지원

- 안드로이드 구조
![안드로이드 구조](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_2(1).png) 

- 응용프로그램(Applications)
    + 안드로이드 스마트폰엣허 사용할 수 있는 일반적인 응용 프로그램
    + 웹 브라우저, 달력, 구글맵, 연락처, 게임 등 사용자 입장에서 가장 많이 사용
    + JAVA로 제작

- 응용 프로그램 프레임워크(Application Framework)
    + 안드로이드 API가 존재하는 곳
    + 안드로이드폰 하드웨어에 접근할 때 API를 통해서만 가능

- 안드로이드 런타임(Anrdroid Runtime)
    + JAVA 코어 라이브러리와 달빅 가상 머신 또는 아트 런타임으로 구성

- 라이브러리(Libraries)
    + 안드로이드에서 사용되는 여러 시스템 라이브러리는 시스템 접근 때문에 JAVA가 아닌 C로 작성
    + 성능이 뛰어나며 세밀한 조작 가능함

- 리눅스 커널(Linux Kernel)
    + 하드웨어의 운영과 관련된 저수준의 관리 기능
    + 메모리 관리, 디바이스 드라이버, 보안 등

![안드로이드 개발환경](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_2(2).png)
![안드로이드 개발환경](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_2(3).png)

</details>

<details>
<summary>9/7</summary>

- 안드로이드 개발 과정

![개발 과정](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_7(2).png)
<hr />

1. [Hello World](https://github.com/DongGeon0908/Android_Study/tree/master/HelloWorld)
![실행사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_7(1).png)
<hr />

2. [Button Base](https://github.com/DongGeon0908/Android_Study/tree/master/basebase)
![실행사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_7(3).png)
<hr />

</details>
<details>
<summary>9/9</summary>

- 안드로이드 어플리케이션 개발 완료

![개발 완료](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_9(1).png)
![개발 완료](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_9(2).png)
<hr />

1. [FourButton](https://github.com/DongGeon0908/Android_Study/tree/master/basebase)
![실행 사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_9(3).png)

- 버튼 1
    + `naver.com` 연결
- 버튼 2
    + `911` 전화
- 버튼 3
    + `갤러리` 열기
- 버튼 4
    + 종료
<hr />

### res 폴더
- 앱 개발에 사용되는 이미지, 레이아웃, 문자열 등이 들어가는 폴더
    + `drawable` : 이미지 파일 저장
    + `layout` : 액티비티(화면)을 구성하는 xm1 파일을 넣으면 됨
    + `values` : 문자열을 저장하는 string.xml 등이 들어 있음
    + `menu` : 메뉴 xml 파일이 저장되어 있음
 - `res(generated)`
    + `Android Studio 3.5` 부터 제공
    + 내부적으로 사용
<hr />

### manifests 폴더
- `AndroidManifest.xml` 파일이 들어 있음
- 앱의 여러 가지 정보를 담고 있음
<hr />

### Gradle Scripts 폴더
- `build.gradle (Module: app)` : 빌드 스크립트 핵심 파일
- `local.properties` : 컴파일되는 SDK의 경로가 들어 있음
- `gradle.properties` : JVM 관련 메모리가 설정되어 있음
<hr />
</details>

<summary>9/16 (자바 라뷰)</summary>

<details>
<summary>9/16</summary>

- View 클래스
![View](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_14(1).png)
![View](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_14(2).png)


- Button 클래스
![View](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_14(3).png)
![View](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_14(4).png)

- id 속성
    + 모든 위젯의 아이디를 나타냄
    + JAVA 코드에서 위젯에 접근할 떄 id 속성에 지정한 아이디 사용
    + id 속성은 위젯에 아이디를 새로 부여하는 개념이므로 `@+id/` 형싯으로 지정

- `match_parent`
    + 자신의 부모(대게는 레이아웃)에 폭이나 높이를 맞춤

- `wrap_content`
    + 자신의 폭이나 높이를 자신 안의 글자가 들어갈 정도로만 설정

- `background`
    + 위젯의 색상을 주로 #RRGGBB 값으로 지정

- `padding`
    + 위젯의 경계선으로부터 위젯 안의 요소가 떨어지도록 설정

- `layout_margin`
    + 위젯과 위젯 사이에 여유를 둘때 사용

- `visibility`
    + 위젯을 보일 것인지 여부를 결정
    + defualt는 `visible`
    + `invisible`과 `gone`은 보이지 않는 상태

- `enabled`
    + 위젯의 동작 여부
    + `true`와 `false`로 지정

- `clickable`
    + 클릭이나 터치가 가능하도록 함
    + `true`와 `false`로 지정

- `rotation`
    + 위젯을 회전시켜서 출력
    + 값은 각도로 지정

- 텍스트 뷰 속성
![View](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_14(5).png)
![View](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_14(6).png)

1. [간단한 실습](https://github.com/DongGeon0908/Android_Study/tree/master/Chapter4)
![실행 사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_14(7).png)

</details>
<details>
<summary>9/21</summary>

1. [간단한 계산기](https://github.com/DongGeon0908/Android_Study/tree/master/calculater)
![실행 사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_21(1).png)
<hr />

- 체크박스
    + 체크할 때마다 상태가 체크, 언체크로 변경
    + 여러 개의 체크박스가 있어도 서로 독립적으로 동작
![실행 사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_21(2).png)

- 스위치와 토글버튼
    + 체크박스와 모양만 다를뿐 용도는 거의 동일

- 라디오버튼
    + 여러 개 중 하나만 선택해야 하는 경우에 사용

- 라디오그룹
    + 라디오버튼만 여러 개 나열하면 클릭하는 것마다 모두 중복 선택이 되므로 라디오그룹과 함께 사용해야 함

- 이미지뷰(Image View)
    + 그림을 출력하는 위젯으로 그림이 필요하거나 화면을 화려하게 구성할 때 사용
    + 이미지뷰에 보여줄 그림 파일은 프로젝트의 `res - drawable`에 있어야 함
    + `@drawable/그림 id`
![실행 사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_21(3).png)
<hr />

2. [간단한 이미지 변환](https://github.com/DongGeon0908/Android_Study/tree/master/MyPet)
![실행 사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_21(4).png)

<hr />

</details>
<details>
<summary>9/23</summary>

- 레이아웃
    + ViewGroup 클래스로부터 상속받음
![실행 사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(1).png)    
![실행 사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(2).png)    
![실행 사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(3).png)    
![실행 사진](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(4).png)    

1. [실습파일](https://github.com/DongGeon0908/Android_Study/tree/master/layout)
- ![LinearLayout-vertical](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(5).png)

- ![LinearLayout-horizontal](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(6).png)

- ![LinearLayout-gravity](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(7).png)
    + `gravity` 속성은 레이아웃 안의 위젯을 어디에 배치할 것인지 결정

- ![layout-gravity](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(8).png)

- ![baselineAligned](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(9).png)

- 중복 리니어 레이아웃
    + 리니어레이아웃 안에 리니어레이아웃 생성하는 방식
- `layout_weight`  
    + 리니어레이아웃을 여러 개 사용할 경우 각 레이아웃의 크기를 지정할 때 사용
    + 주로 전체 화면에 대한 비율(%)로 지정

- ![LinearLayout](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(10).png)

- `LinearLayout - .xml파일로 설정`
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="right"
    tools:context=".MainActivity">


    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:orientation="horizontal">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#ff0000"
            android:orientation="vertical">
        </LinearLayout>


        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#00ff00"
            android:orientation="vertical">


        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#ffff00"
            android:orientation="vertical">
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#000000"
            android:orientation="vertical">
        </LinearLayout>
        </LinearLayout>
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:layout_weight="1"
            android:background="#0000ff"
            android:orientation="vertical">
        </LinearLayout>
</LinearLayout>
```

- `.xml`파일 없이 JAVA파일로 Layout 구현
- ![LinearLayout](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_23(11).png)

```
package kr.ac.hs.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        setContentView(baseLayout, params);
        
    }
}
```
<hr />
</details>
<details>
<summary>9/28</summary>

- 랠러티브레이아웃
1. [간단한 계산기](https://github.com/DongGeon0908/Android_Study/tree/master/layout2)
- ![랠러티브레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(1).png)
- ![랠러티브레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(2).png)
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true"
        android:text="위" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentLeft="true"
        android:layout_centerVertical="true"
        android:text="왼쪽" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_centerVertical="true"
        android:text="오른쪽" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:text="아래" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerInParent="true"
        android:text="중앙" />


</RelativeLayout>
```


- 상대 위치에 배정
- ![랠러티브레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(3).png)
- ![랠러티브레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(4).png)
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/baseBtn"
        android:layout_width="150dp"
        android:layout_height="150dp"
        android:layout_centerInParent="true"
        android:layout_centerVertical="true"
        android:text="기준위젯" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBaseline="@+id/baseBtn"
        android:layout_toLeftOf="@+id/baseBtn"
        android:text="2번" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_above="@+id/baseBtn"
        android:text="3번" />


</RelativeLayout>
```
<hr />

- ![랠러티브레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(5).png)
```
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentLeft="true"
        android:text="전화번호"
        android:textSize="25sp" />

    <EditText
        android:id="@+id/editText1"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_toRightOf="@+id/textView1"
        android:hint="000-0000-0000" />

    <Button
        android:id="@+id/btnCancel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignParentRight="true"
        android:layout_below="@+id/editText1"
        android:text="취소" />

    <Button
        android:id="@+id/btnOK"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignBaseline="@+id/btnCancel"
        android:layout_toLeftOf="@+id/btnCancel"
        android:text="입력" />


</RelativeLayout>
```
<hr />

- 테이블레이아웃
![테이블레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(6).png)
![테이블레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(7).png)
[테이블레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(8).png)
```
<?xml version="1.0" encoding="utf-8"?>
<TableLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TableRow>
        <Button
            android:layout_width="60dp"
            android:text="1"
            />
        <Button
            android:layout_width="60dp"
            android:text="2"
            />
        <Button
            android:layout_width="60dp"
            android:text="3"
            />
        <Button
            android:layout_width="60dp"
            android:text="4"
            />
        <Button
            android:layout_width="60dp"
            android:text="5"
            />

    </TableRow>


</TableLayout>
```
<hr />

- 그리드 레이아웃
![그리드레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(9).png)
![그리드레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(10).png)

- 프레임 레이아웃
![프레임레이아웃](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(11).png)

1. [계산기 예제](https://github.com/DongGeon0908/Android_Study/tree/master/calc)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/9_28(12).png)

</details>
<details>
<summary>과제1</summary>

[이미지 변환](https://github.com/DongGeon0908/Android_Study/tree/master/project1)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/project(1).png)

</details>
<details>
<summary>10/5</summary>

- 프로젝트 파일 구조
    + `manifests, java, res, Gradle Scripts`의 주요 모듈로 구성
    + 각 모듈의 파일들은 프로젝트를 만들 때 액티비티 유형에 따라 일부 다름
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(1).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(2).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(3).png)
<hr />

- 프로젝트 파일 간 연관성과 앱의 실행 원리
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(4).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(5).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(6).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(7).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(8).png)
<hr />

- 애플리케이션의 기초 개념
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(9).png)

- 애플리케이션은 컴포넌트로 이뤄짐
    + 액티비티(activity)
        * 사용자 인터페이스 화면을 가지는 하나의 작업
        * 액티비티들이 모여서 애플리케이션이 됨
    + 서비스(service)
        * 백그라운드에서 실행되는 컴포넌트로서 오랫동안 실행되는 작업이나 원격 프로세스를 위한 작업
    + 방송 수신자(broadcast resceiver)
        * 방송을 받고 반응하는 컴포넌트
    + 컨텐트 제공자(content provider)
        * 데이터를 관리하고 다른 애플리케이션에게 제공하는 컴포넌트
- 안드로이드에서는 다른 컴포넌트의 데이터를 사용할 수 있음
- 인텐트
    + 애플리케이션의 의도를 적어서 안드로이드에 전달하면 안드로이드가 가장 적절한 컴포넌트를 찾아서 활성화하고 실행
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(10).png)

- 안드로이드 애플리케이션의 실행 시작
    + 액티비티별로 실행
    + onCreate() 메소드가 가장 먼저 실행
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_5(11).png)

- 코드와 리소르를 분리하는 이유
    + 안드로이드가 탑재된 장치들이 다양해지면서 언어나 화면 크기에 따라서, 리소르를 다르게 하는것이 필요

</details>
<details>
<summary>10/7</summary>

- 컨스트레인트 레이아웃
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(1).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(2).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(3).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(4).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(5).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(6).png)

- 입력 위젯
    + 사용자의 입력을 받을 수 있는 위젯
    + 안드로이드에서 다양한 입력 위젯 제공

- 이벤트 처리
    + `onClick'을 통해 이벤트 처리 가능
    + `public'만 가능
    + `View`를 메소드의 인수로 사용
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(7).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(8).png)

- 폴링과 이벤트 구동 방식
    + 안드로이드는 이벤트 구동 방식 지원

- 안드로이드에서의 이벤트 처리 방법
    + XML 파일에 이벤트 처리 메소드를 등록
    + 이벤트 처리 객체를 생성하여 컴포넌트 등록
    + 뷰 클래스의 이벤트 처리 메서드를 재정의

- 이벤트 리스너
    + 리벤트를 처리하는 객체를 생성하여 위젯에 등록
    + 이벤트를 처리하는 객체를 이벤트를 처리하는 메소를 가지고 있어야 함
    + 이벤트를 처리하는 메소드들이 정의된 인터페이스를 의미
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(9).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(10).png)

- 무명 클래스
    + 클래스 몸체는 정의되지만 이름이 없는 클래스
    + 클래스를 정의하면서 동시에 객체를 생성
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(11).png)

- 리스너 객체를 생성하는 방법
    + 내부 클래스
        * 리스너 클래스를 내부 클래스로 정의
        * 내부 클래스는 클래스 안에 정의
        * 자신이 속해있는 클래스의 멤버들에 자유롭게 접근 가능
        ![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(12).png)
    ![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(14).png)
    + 무명 클래스
        * 한번만 사용되는 클래스인 경우, 이름을 붙일 필요 없이 무명 클래스로 정의
        * 코드의 양을 줄일 수 있지만, 표기법이 난해함
    ![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(15).png)
    + 액티비티 클래스
        * OnClickListener 인터페이스를 액태비티 클래스에 구현
        * 어떤 클래스에도 인터페이스는 구현할 수 있음
    ![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_7(16).png)

</details>
<details>
<summary>10/12</summary>

- 기본 위젯
    + `TextView, Button, EdiitText`
    + `CompoundButton, CheckBox`
    + `RadioButton, Switch, ToggleButton`
    + `ImageView, ImageGroup`
<hr />

- 고급 위젯
    + API 사용해 앱 기능을 빠르게 개발/추가

- 날짜/시간 관련 위젯
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(1).png)


- 아날로그 시계
```
public class AnalogClock extends View

java.lang.Object > android.view.View > android widget AnalogClock
```

- 디지털 시계
```
public class DigitalClock extends TextView
```


![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(2).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(3).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(4).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(5).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(6).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(7).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(8).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(9).png)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(10).png)


- 시계 및 달력 예제
[Button Base](https://github.com/DongGeon0908/Android_Study/tree/master/widgetTime)
![실행화면](https://github.com/DongGeon0908/Android_Study/blob/master/pic/10_12(11).png)

</details>