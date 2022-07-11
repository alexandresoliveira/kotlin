package com.example.infra.databases.entities

import org.hibernate.annotations.GenericGenerator
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.io.Serializable
import java.time.LocalDateTime
import javax.persistence.*

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class BaseEntity<T : Serializable> {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "hibernate-uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    var id: T? = null

    @Column(name = "created_at", nullable = false)
    @CreatedDate
    var createdAt: LocalDateTime? = LocalDateTime.now()

    @Column(name = "updated_by", nullable = false)
    @LastModifiedBy
    var updatedAt: LocalDateTime? = LocalDateTime.now()

    @Column(name = "version", nullable = false)
    @Version
    var version: LocalDateTime? = LocalDateTime.now()
}
