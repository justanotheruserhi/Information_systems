package com.javapoint.habits.config;


import com.javapoint.habits.model.Client;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig /*implements WebSecurityConfig_newinterface*/ {

    private final DataSource dataSource;
    //private PasswordEncoder passwordEncoder;


    public WebSecurityConfig (DataSource dataSource){
        this.dataSource = dataSource;
    }

    //@Bean
    //public PasswordEncoder passwordEncoder() {
       // return new BCryptPasswordEncoder();
   // }

    // Enable jdbc authentication
    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource) //.passwordEncoder(passwordEncoder())
         ;
    }

    @Bean
    public JdbcUserDetailsManager jdbcUserDetailsManager() throws Exception {
        JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager();
        jdbcUserDetailsManager.setDataSource(dataSource);
        return jdbcUserDetailsManager;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin((form) -> form
                        .loginPage("/login")
                        .permitAll()
                )
                .logout((logout) -> logout.permitAll());
        return http.build();
    }
   /* @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .passwordEncoder(NoOpPasswordEncoder.getInstance())
                .usersByUsernameQuery("select username, password, active from user_data where username=?")
                .authoritiesByUsernameQuery("select u.username, u.roles from user_data u inner join user_role ur on u.id = u.user_id where u.username=?");
    }*/
   /*@Bean
    public UserDetailsService userDetailsService() {
        UserDetails user =
                User
                        .username("user123")
                        .password("$2a$10$K.V22OWHu/tV8E4f/r.D7.8szW3wBG3TG.dWmpwh8iBVowM99b0lu")
                        .roles("CLIENT")
                        .build();

        return new InMemoryUserDetailsManager(user);
    }*/

}
