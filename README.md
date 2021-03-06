BACKEND _ JAVA & KOTLIN 🐻
============ 

GGOMJAE
------
* Author 민경재[ggomjae] <br>
* 개인 개발 블로그2 링크 <https://velog.io/@ggomjae> <br>
* 개인 개발 블로그1 및 일상 링크 <https://blog.naver.com/ggomjae> <br>

계획
-------
* Java backEnd 기술 모음 저장소 [ 멀티모듈로 계속적인 업데이트를 할 예정]
* 멀티 모듈이기 때문에 연관된 도메인끼리 네이밍 : [ 분류 ]-[ 도메인 ]-[ 기능 ]
* 일부 모듈 practice : 연습장
* Algorithm 모듈 : Java 8 ~ 11 로 구현하는 알고리즘
-------

TEST
============

### api-test-management

* [2021-04-14] @ControllerAdvice를 이용한 AOP Exception 구현 
* [2021-04-15] Compile 시 Static Area를 참고하여 Class Method 호출 (Reflection 이용) 
* [2021-04-16] ObjectMapper, Entity 를 이용하여 Reflection 확인 [BLOG에 정리한 부분](https://velog.io/@ggomjae/ObjectMapper-JPA-Entity-NoArgsConstructor-Java-Reflection)
* [2021-04-24] Controller Test 구현 (Test Dto 이용)
* [2021-05-23] RequestDto Keywords(List) -> Key : EtoMethod 이용하여 List<ResultDto>    

### module-modifycode

* [2021-04-17] ByteBuddy를 이용하여 ByteCode 조작 실습 (간단) [BLOG에 정리한 부분](https://velog.io/@ggomjae/ByteCode-%EC%A1%B0%EC%9E%91-ASM-ByteBuddy-%EC%93%B0%EC%9D%B4%EB%8A%94-%EA%B3%B3-ComponentScan)


BASIC
============

### api-basic-management

* [2021-03-08] Excel 구현 [ web 의존 필수 ]
* [2021-03-11] N : 1 - Post Repy 관계에서 DynamicInsert로 구현하였으나 원치않은 결과 나옴 (EntityManager 로 해결) [BLOG에 정리한 부분](https://velog.io/@ggomjae/JPA-N-1-%EA%B4%80%EA%B3%84-Department-Employee%EC%97%90%EC%84%9C-Employee-Entity%EB%A5%BC-%EC%A0%80%EC%9E%A5%ED%95%A0-%EB%95%8C.-Proxy-Entity-%EB%B6%88%EB%9F%AC%EC%98%A4%EA%B8%B0)
* [2021-03-21] PostController -> PostService를 갈 때, RequestDto를 넘기는 게 아닌 Entity를 넘긴다. (Domain) 역할 분리.
* [2021-04-02] Department, Employee N : 1 관계 Proxy Entity & Entity Save 성능 확인 [BLOG에 정리한 부분](https://velog.io/@ggomjae/JPA-N-1-%EA%B4%80%EA%B3%84-Department-Employee%EC%97%90%EC%84%9C-Employee-Entity%EB%A5%BC-%EC%A0%80%EC%9E%A5%ED%95%A0-%EB%95%8C.-Proxy-Entity-%EB%B6%88%EB%9F%AC%EC%98%A4%EA%B8%B0)
* [2021-04-11] @RequireArgsConstructor 순환 방지 Test -CycleTest1, CycleTest2 [BLOG에 정리한 부분](https://velog.io/@ggomjae/Spring-Framework-DI-Dependency-Injection)

### module-basic-utils

* [2021-03-06] CustomMapKey : Map Key가 1개가 아닌 복합일 때, CustomMapKey 구현 후 사용. (ex : 통계)
* [2021-03-06] StringToTimeStamp : String으로 time을 받아올 경우 (ex : log 긁기)
* [2021-03-30] Enum + Functional Interface 적용 : Student, Admin 타입에 따른 Cost 계산 [BLOG에 정리한 부분](https://velog.io/@ggomjae/Functional-Interface-Enum-FunctionT-R)
* [2021-04-05,06] CurrentTimeFinal(현재시간 4가지), TimeMills(Milli -> String,Timestamp),  Timestamp 시간 차이 구하기 (시, 분, 초)

### module-querydsl-db

* [2021-03-22] querydsl 셋팅 및 구현
* [2021-03-28] AccessLevel 실험 (Protected 일때, Public 일때 등)
* [2021-04-04] Member Entity 생성 - GenerationType.IDENTITY , GenerationType.AUTO 차이 [BLOG에 정리한 부분](https://velog.io/@ggomjae/GenerationType.IDENTITY-GenerationType.AUTO-%EC%B0%A8%EC%9D%B4)
* [2021-04-10] ClusterIndex, Non-ClusterIndex 성능 확인 [BLOG에 정리한 부분](https://velog.io/@ggomjae/Cluster-Index-vs-Non-Cluster-Index-%EC%84%B1%EB%8A%A5-%EB%B9%84%EA%B5%90-%EB%B0%8F-%EC%9D%B4%EB%A1%A0)

QB [ Quartz + Batch ]
============

<div>
    <img align="left" width="100%" src = "https://user-images.githubusercontent.com/43604493/110316302-de93d700-804d-11eb-95fa-7041e8b7a718.PNG">
</div>
-


### module-qb-scheduler

* [2021-03-07] Quartz + batch : One Job, One Step ( CustomItem - 1 )
* [2021-03-08] Quartz + batch : Multi Job, Multi Step, MultiWriter ( CustomItem - 2 )

Algorithm 
============

### module-algorithm

* [2021-04-09] Fibonacci Algorithm - IntStream.generate + IntSupplier 로 구현 [BLOG에 정리한 부분](https://velog.io/@ggomjae/%ED%94%BC%EB%B3%B4%EB%82%98%EC%B9%98-%EC%88%98%EC%97%B4-IntSupplier-IntStream.generate-%EA%B3%BC%EC%97%B0-DP%EC%9D%BC%EA%B9%8C)

EXTRA BackEnd 정리 [블로그](https://velog.io/@ggomjae) 정리 모음
============

#### naver
* [2021-02-01] 양방향 : cascade = CascadeType.ALL 를 써야하는 이유 [BLOG에 정리한 부분](https://blog.naver.com/ggomjae/222228013884)
* [2021-02-18] JPA 복합키 매핑 ( @EmbeddedId 지향 )  + @EmbeddedId 식별자 관계 [부모,자식,손자] 풀코드 [BLOG에 정리한 부분](https://blog.naver.com/ggomjae/222247631927)
* [2021-02-18] JPA 복합키 순서 정하기 ( + 그냥 수동으로하기 ) [BLOG에 정리한 부분](https://blog.naver.com/ggomjae/222247900876)

#### velog 
* [2021-04-16] Repository Interface에 @Repository 를 안써도 되는 이유 [BLOG에 정리한 부분](https://velog.io/@ggomjae/Repository-Interface%EC%97%90-Repository-%EB%A5%BC-%EC%95%88%EC%8D%A8%EB%8F%84-%EB%90%98%EB%8A%94-%EC%9D%B4%EC%9C%A0)
* [2021-04-20] Collect, Collector, Collectors [BLOG에 정리한 부분](https://velog.io/@ggomjae/Collect-Collector-Collectors-OO)
* [2021-05-04] QueryDSl 하나 테이블을 여러번 Join 할 때 alias [BLOG에 정리한 부분](https://velog.io/@ggomjae/QueryDSl-%ED%95%98%EB%82%98-%ED%85%8C%EC%9D%B4%EB%B8%94%EC%9D%84-%EC%97%AC%EB%9F%AC%EB%B2%88-Join-%ED%95%A0-%EB%95%8C-alias)
* [2021-05-12] 나는 왜 JPA를 공부하는가? [BLOG에 정리한 부분](https://velog.io/@ggomjae/%EB%82%98%EB%8A%94-%EC%99%9C-JPA%EB%A5%BC-%EA%B3%B5%EB%B6%80%ED%95%98%EB%8A%94%EA%B0%80)
* [2021-05-14] JPA 영속성 관리 [BLOG에 정리한 부분](https://velog.io/@ggomjae/JPA-%EC%98%81%EC%86%8D%EC%84%B1-%EA%B4%80%EB%A6%AC)
* [2021-05-15] JPA 엔티티 매핑 [BLOG에 정리한 부분](https://velog.io/@ggomjae/JPA-%EC%97%94%ED%8B%B0%ED%8B%B0-%EB%A7%A4%ED%95%91)
* [2021-05-27] JPA 연관관계 기초 [BLOG에 정리한 부분](https://velog.io/@ggomjae/JPA-%EC%97%B0%EA%B4%80%EA%B4%80%EA%B3%84-%EA%B8%B0%EC%B4%88)
* [2021-06-10] JPA 고급 매핑 [BLOG에 정리한 부분](https://velog.io/@ggomjae/JPA-%EA%B3%A0%EA%B8%89-%EB%A7%A4%ED%95%91)

# 끝맺음
<br>

> 주기적인 업데이트. <br>
> 완전한 코드는 Git 위의 코드 부분을 봐주세요. <br>
