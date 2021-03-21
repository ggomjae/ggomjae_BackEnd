package com.ggomjae.gom.apibasicmanagement.QueryDslRepository;

import com.ggomjae.gom.modulequerydsldb.domain.Person;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

import static com.ggomjae.gom.modulequerydsldb.domain.QPerson.person;

@RequiredArgsConstructor
@Repository
public class PersonRepository implements PersonRepositoryInterface{

    /*
        You may wonder, why JPAQueryFactory doesn’t have the .
        insert() method. This is a limitation of JPA Query interface.
        The underlying javax.persistence.Query.executeUpdate() method is capable of executing update
        and delete but not insert statements. To insert data,
        you should simply persist the entities with EntityManager.
     */
    private final JPAQueryFactory queryFactory;
    private final EntityManager entityManager;

    /*
        현재 저장되있으나 [] 값이 나옴. 읭?
        여유로울때 할것
     */
    @Override
    public List<Person> retrieveAllPerson(){
        return queryFactory.select(person)
                .from(person)
                .fetch();
    }

    // 미완성
    @Override
    public void savePerson(Person person){
        entityManager.persist(person);
    }

    /*
        Query nativeQuery = em.createNativeQuery(sql);
        JpaResultMapper jpaResultMapper = new JpaResultMapper();
        List<ProductOrderedMemberDTO> products = jpaResultMapper.list(nativeQuery, ProductOrderedMemberDTO.class)
     */
}
