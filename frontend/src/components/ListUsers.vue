<template>
	<div>
		<input
			type="text"
			v-model="searchUsers"
			name="searchUsers"
			id="searchUsers"
			placeholder="Chercher un utilisateur"
		/>
		<div v-for="user in filteredUsers" :key="user.userId">
			<p @click="goProfil(user.username)">{{ user.username }}</p>
		</div>
	</div>
</template>

<script>
export default {
	name: "ListUsers",
	components: {},
	props: ["users"],
	data: () => {
		return {
			searchUsers: "",
			// testUsers: [],
		};
	},
	computed: {
		filteredUsers: function () {
			// return this.users;
			const target_copy = JSON.parse(JSON.stringify(this.users));
			console.log(target_copy[1]);
			if (typeof target_copy[1] !== "undefined")
				return Object.values(target_copy[1]).filter((u) =>
					u.username
						.toLowerCase()
						.includes(this.searchUsers.toLowerCase())
				);
			return target_copy;
		},
	},
	methods: {
		goProfil: function (nickname) {
			// console.log(this.users);
			// const target_copy = JSON.parse(JSON.stringify(this.users));
			console.log(nickname);
			this.$router.push({
				name: "profiles",
				params: { username: nickname },
			});
		},
	},
};
</script>

<style>

#searchUsers{
	text-align: center;
	width: 20em;
	height: 40px;
	padding: 12px 20px;
	box-sizing: border-box;
	border: 1px solid rgb(19, 24, 66);
	border-radius: 4px;
	background-color: #b9d5ec;
	font-size: 20px;
}

</style>
