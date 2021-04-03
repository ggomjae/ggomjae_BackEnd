BACKEND _ JAVA & KOTLIN 🐻
============ 

GGOMJAE
------
* Author 민경재[ggomjae] <br>
* 개인 개발 블로그 링크 <https://blog.naver.com/ggomjae> <br>

계획
-------
* Java backEnd 기술 모음 저장소 [ 멀티모듈로 계속적인 업데이트를 할 예정]
* Kotlin 도 적용하여 천천히 익숙해질 예정
* 멀티 모듈이기 때문에 연관된 도메인끼리 네이밍 : [ 분류 ]-[ 도메인 ]-[ 기능 ]
* 일부 모듈 practice : 연습장  
-------

BASIC
============

api-basic-management
* [2021-03-08] Excel 구현 [ web 의존 필수 ]
* [2021-03-11] N : 1 - Post Repy 관계에서 DynamicInsert로 구현하였으나 원치않은 결과 나옴 ( 다시 해보기 )
* [2021-03-21] PostController -> PostService를 갈 때, RequestDto를 넘기는 게 아닌 Entity를 넘긴다. (Domain) 역할 분리.
* [2021-04-02] Department, Employee N : 1 관계 Proxy Entity & Entity Save 성능 확인 [BLOG에 정리한 부분](https://velog.io/@ggomjae/JPA-N-1-%EA%B4%80%EA%B3%84-Department-Employee%EC%97%90%EC%84%9C-Employee-Entity%EB%A5%BC-%EC%A0%80%EC%9E%A5%ED%95%A0-%EB%95%8C.-Proxy-Entity-%EB%B6%88%EB%9F%AC%EC%98%A4%EA%B8%B0)

module-basic-utils
* [2021-03-06] CustomMapKey : Map Key가 1개가 아닌 복합일 때, CustomMapKey 구현 후 사용. ( ex : 통계)
* [2021-03-06] StringToTimeStamp : String으로 time을 받아올 경우 ( ex : log 긁기)
* [2021-03-30] Enum + Functional Interface 적용 : Student, Admin 타입에 따른 Cost 계산

module-querydsl-db
* [2021-03-22] querydsl 셋팅 및 구현
* [2021-03-28] AccessLevel 실험 (Protected 일때, Public 일때 등)

QB [ Quartz + Batch ]
============

<div>
    <img align="left" width="100%" src = "https://user-images.githubusercontent.com/43604493/110316302-de93d700-804d-11eb-95fa-7041e8b7a718.PNG">
</div>
-


module-qb-scheduler
* [2021-03-07] Quartz + batch : One Job, One Step ( CustomItem - 1 )
* [2021-03-08] Quartz + batch : Multi Job, Multi Step, MultiWriter ( CustomItem - 2 )


# 끝맺음
<br>

> 주기적인 업데이트. <br>
> 완전한 코드는 Git 위의 코드 부분을 봐주세요. <br>