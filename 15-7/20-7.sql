 REPLACE FUNCTION calculate_total(
    mark1 INT,
    mark2 INT, 
    mark3 INT
)
RETURNS INT
LANGUAGE plpgsql
AS $$
BEGIN
    RETURN mark1 + mark2 + mark3;
END;
$$;

-- Procedure to display result
CREATE OR REPLACE PROCEDURE student_result(
    mark1 INT,
    mark2 INT,
    mark3 INT
)
LANGUAGE plpgsql
AS $$
DECLARE
    total INT;
BEGIN
    total := calculate_total(mark1, mark2, mark3);

    RAISE NOTICE 'Total Marks : %', total;

    IF total >= 150 THEN
        RAISE NOTICE 'Result : PASS';
    ELSE
        RAISE NOTICE 'Result : FAIL';
    END IF;
END;
$$;

-- Execute
CALL student_result(60, 55, 50);

CREATE OR REPLACE FUNCTION calculate_si(
    principal NUMERIC,
    rate NUMERIC,
    time NUMERIC
)
RETURNS NUMERIC
LANGUAGE plpgsql
AS $$
BEGIN
    RETURN (principal * rate * time) / 100;
END;
$$;

-- Procedure to display Principal, SI and Total Amount
CREATE OR REPLACE PROCEDURE simple_interest(
    principal NUMERIC,
    rate NUMERIC,
    time NUMERIC
)
LANGUAGE plpgsql
AS $$
DECLARE
    si NUMERIC;
    total NUMERIC;
BEGIN
    si := calculate_si(principal, rate, time);
    total := principal + si;

    RAISE NOTICE 'Principal Amount : %', principal;
    RAISE NOTICE 'Simple Interest  : %', si;
    RAISE NOTICE 'Total Amount     : %', total;
END;
$$;

CALL simple_interest(10000, 5, 2);







select * from bio_data




do $$
declare num int :=0;
begin while num <=20 loop
if num%2=0 then
raise notice '%',num;
end if;
num:=num+1;
end loop;
end;
$$;


do $$
begin for num in 0..20 loop
if num%2=0 then
raise notice '%',num;
end if;
num:=num+1;
end loop;
end
$$



do $$
begin for num in reverse 20..0 loop
if num%2=0 then
raise notice '%',num;
end if;
num:=num-1;
end loop;
end
$$

create table students(stuid int primary key,sname varchar not null,phn bigint not null ,age int not null )
 
 
 
create table stuatt(stuid int ,sname varchar,satt time)


create or replace  function  stu()
returns trigger
language plpgsql
as $$
begin
insert into stuatt(stuid,sname,satt) values(new.stuid,new.sname,new.satt);
return new;
end;
$$;

create trigger trig after insert on students for each row execute function stu();





