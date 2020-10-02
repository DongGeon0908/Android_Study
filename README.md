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