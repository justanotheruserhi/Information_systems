create table if not exists user_data (
	user_id integer not null primary key,
	username varchar (20)not null unique,
	password varchar (10) not null,
	birthday date not null
);

create table if not exists habits_data (
	habit_id integer not null primary key,S
	habit_desc varchar (255) not null,
	habit_color integer (5)
);

create table if not exists positive_notifs (
	note_pos_id integer not null primary key,
	note_pos_txt varchar (30) not null
);

create table if not exists negative_notifs (
	note_neg_id integer not null primary key,
	note_neg_txt varchar (30) not null
);

create table if not exists friends_data (
	not null foreign key (user_id)
		references user_data (user_id),
	not null foreign key (friend_id)
		references user_data (user_id),
	not null foreign key (friend_two_id)
		references user_data (user_id)
);

create table if not exists user_check_in (
	not null foreign key (user)
		references user_data (user_id),
	not null foreign key (habit)
		references habits_data (habit_id),
	check_date timestamp
);

create table if not exists statistics (
    not null foreign key (user_id)
        references user_data (user_id),
    cnt_habits integer not null,
    date_start date not null,
    date_end date not null,
);