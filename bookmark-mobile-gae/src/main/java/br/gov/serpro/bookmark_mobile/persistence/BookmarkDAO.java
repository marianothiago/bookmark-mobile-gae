package br.gov.serpro.bookmark_mobile.persistence;

import br.gov.frameworkdemoiselle.objectify.template.ObjectifyCrud;
import br.gov.frameworkdemoiselle.stereotype.PersistenceController;
import br.gov.serpro.bookmark_mobile.domain.Bookmark;

@PersistenceController
public class BookmarkDAO extends ObjectifyCrud<Bookmark> {
	
	private static final long serialVersionUID = 1L;
	
}
