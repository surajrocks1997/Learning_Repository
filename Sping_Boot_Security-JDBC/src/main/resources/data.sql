INSERT INTO users (username, password, enabled)
	values ('suraj', 'suraj', true);
	
INSERT INTO users (username, password, enabled)
	values ('sangamesh', 'sangamesh', true);	
	
	
INSERT INTO authorities (username, authority)
	values ('suraj', 'ROLE_ADMIN');
	
INSERT INTO authorities (username, authority)
	values ('sangamesh', 'ROLE_USER');
	
	