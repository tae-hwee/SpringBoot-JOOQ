package com.example.demo.service;

import generated.org.jooq.tables.Author;
import generated.org.jooq.tables.records.AuthorRecord;
import lombok.RequiredArgsConstructor;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthorService {
	@Autowired
	private DSLContext dsl;

	public String getAuthorName(long id) {
		String authorName = null;

		Author author = Author.AUTHOR;

		Result<Record1<String>> result = dsl
				.select(author.AUTHORNAME)
				.from(author)
				.where(author.ID.eq(id))
				.fetch();

		authorName = result.get(0).value1();

		return authorName;
	}

	public Result getAllAuthors() {
		Author author = Author.AUTHOR;

		Result<AuthorRecord> results = dsl
				.selectFrom(author)
				.fetch();

		return results;
	}
}
